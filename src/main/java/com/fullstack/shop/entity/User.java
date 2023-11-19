package com.fullstack.shop.entity;

import java.sql.Timestamp;

import com.fullstack.shop.dto.UserResponseDto;

import lombok.Data;

@Data
public class User {

	public long userId;
	public String email;
	public String userName;
	public String password;
	public int role;
	public Timestamp createdAt;
	public Timestamp updatedAt;

	public Object toDto() {
		UserResponseDto userDto = new UserResponseDto();
		userDto.setUserId(userId);
		userDto.setEmail(email);
		userDto.setUserName(userName);
		userDto.setRole(role);
		userDto.setCreatedAt(createdAt);
		userDto.setUpdatedAt(updatedAt);
		return userDto;
	}
}
