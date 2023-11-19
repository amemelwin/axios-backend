package com.fullstack.shop.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fullstack.shop.dto.LoginRequestDto;
import com.fullstack.shop.dto.RegisterRequestDto;
import com.fullstack.shop.entity.User;
import com.fullstack.shop.repository.AuthRepository;
import com.fullstack.shop.response.ApiErrorResponse;
import com.fullstack.shop.response.ApiResponse;

@Service
public class AuthService {
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	AuthRepository authRepository;
	

	public ResponseEntity<Object> getUserByEmail(LoginRequestDto loginDto) {
		Map<String, Object> errors = loginDto.validate();	
		
		User user = authRepository.getUserByEmail(loginDto);
		return ResponseEntity.ok(user);
	}

	
	public User findUserByEmail(String email) {
		return authRepository.findUserByEmail(email);
	}
	
	public ResponseEntity<Object> register(RegisterRequestDto registerReqDto){
		
		// validate
		Map<String,Object> errors = registerReqDto.validate();
		if(errors.size() >0) {
			return new ApiErrorResponse(HttpStatus.CONFLICT,"Error", errors).response();
		}
		
		// duplicate check
		User user = this.findUserByEmail(registerReqDto.getEmail().toLowerCase());
		if(user == null) {
			// create user	
			try {
				authRepository.createUser(registerReqDto.email.toLowerCase(),registerReqDto.userName,passwordEncoder.encode(registerReqDto.password));
				return new ApiResponse(HttpStatus.OK, "User is successfully registered",user).response();

			}catch(Exception e) {
				return new ApiResponse(HttpStatus.CONFLICT, "User Can not be created").response();

			}
		}else {
			// error 
			return new ApiResponse(HttpStatus.CONFLICT, "User is  already existed").response();

		}	
	}
}
