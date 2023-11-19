package com.fullstack.shop.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class LoginResponseDto {

	private int code;
	private String message;
	private String token;
	private UserResponseDto user;
	
	public LoginResponseDto(HttpStatus status) {
		this.code = status.value();
	}
}
