package com.fullstack.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.shop.entity.User;
import com.fullstack.shop.repository.AuthRepository;


@Service
public class UserService {

	@Autowired
	AuthRepository authRepository;

	public User findByEmail(String mail) {
		return authRepository.findUserByEmail(mail);
	}

}
