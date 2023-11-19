package com.fullstack.shop.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fullstack.shop.config.UserAuthProvider;
import com.fullstack.shop.dto.LoginRequestDto;
import com.fullstack.shop.dto.LoginResponseDto;
import com.fullstack.shop.dto.UserResponseDto;
import com.fullstack.shop.entity.User;
import com.fullstack.shop.response.ApiErrorResponse;



@Service
public class LoginService {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	AuthService authService;

	@Autowired
	UserAuthProvider userAuthProvider;

	@Autowired
	ServiceUtils serviceUtils;

	public ResponseEntity<Object> login(LoginRequestDto loginDto) {

		Map<String, Object> errors = loginDto.validate();
		if (errors.size() > 0) {
			return new ApiErrorResponse(errors, HttpStatus.UNAUTHORIZED,"Error").response();
		}
		User user = authService.findUserByEmail(loginDto.getEmail());
		System.out.println("EMAIL : " + loginDto.getEmail());
		
		if (user != null) {
			if (passwordEncoder.matches(loginDto.getPassword(), user.getPassword())) {
				String token = userAuthProvider.createToken(loginDto.getEmail());
				LoginResponseDto loginResponseDto = new LoginResponseDto(HttpStatus.OK);
				loginResponseDto.setMessage("Success");
				loginResponseDto.setToken(token);
				loginResponseDto.setUser((UserResponseDto) user.toDto());
				return ResponseEntity.ok(loginResponseDto);
			}else if(loginDto.getEmail() != user.email && loginDto.getPassword()!=user.password) {
				return ResponseEntity.ok("error");
			}
		} else {
			return ResponseEntity.ok("error");
		}
		return null;
	}
	

}
