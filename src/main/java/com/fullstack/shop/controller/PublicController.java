package com.fullstack.shop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.shop.dto.LoginRequestDto;
import com.fullstack.shop.dto.RegisterRequestDto;
import com.fullstack.shop.service.AuthService;
import com.fullstack.shop.service.LoginService;

@RestController
public class PublicController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	AuthService authService;

	@PostMapping("/api/v1/login")
	public ResponseEntity<Object> login(@RequestBody LoginRequestDto loginRequestDto) {
		return loginService.login(loginRequestDto);
	}
	
	@PostMapping("/api/v1/register")
	public ResponseEntity<Object> register(@RequestBody RegisterRequestDto registerReqDto){
		return authService.register(registerReqDto);
	}
	
	@GetMapping("/pub/test")
	public ResponseEntity<Object> test(){
		Map<String,Object> response = new HashMap<>();
		response.put("message", "success");
		response.put("code", 200);
 		return ResponseEntity.ok(response);
	}
}
