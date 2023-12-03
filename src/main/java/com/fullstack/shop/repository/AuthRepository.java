package com.fullstack.shop.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fullstack.shop.dto.LoginRequestDto;
import com.fullstack.shop.dto.UserResponseDto;
import com.fullstack.shop.entity.User;



@Mapper
public interface AuthRepository {
	public User getUserByEmail(LoginRequestDto loginDto);
	public User findUserByEmail(@Param("email") String email);

//	public User findByEmail(String mail);
	public void createUser(@Param("email") String email,@Param("userName") String userName, @Param("password") String password );
	public User getUserById(@Param("userId") long userId);
	public User getRecentlyRegisteredUser();

	
}
