package com.fullstack.shop.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fullstack.shop.utiltiy.CommonUtils;

import lombok.Data;

@Data
public class LoginRequestDto {

	private String email;
	private String password;
	
	public Map<String, Object> validate() {
			Map<String,Object> errors = new LinkedHashMap<String, Object>();
			
			if(CommonUtils.isEmpty(email)) {
				errors.put("email", "メールアドレスが必要です。");
			}else if (!CommonUtils.isValidEmail(email)) {
				errors.put("email", "メールアドレスのフォーマットが間違っています。");
			}
			
			if(CommonUtils.isEmpty(password)) {
				errors.put("password", "パスワードが必要です。");
			}
			
			return errors;
	}
}
