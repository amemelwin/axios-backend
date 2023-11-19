package com.fullstack.shop.dto;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fullstack.shop.utiltiy.CommonUtils;

import lombok.Data;

@Data
public class RegisterRequestDto {
	@JsonProperty("email")
	public String email;
	@JsonProperty("user_name")
	public String userName;
	@JsonProperty("password")
	public String password;
	
	public Map<String, Object> validate() {
		Map<String,Object> errors = new LinkedHashMap<String, Object>();
		
		if(CommonUtils.isEmpty(this.email)) {
			errors.put("email", "メールアドレスが必要です。");
		}else if (!CommonUtils.isValidEmail(this.email)) {
			errors.put("email", "メールアドレスのフォーマットが間違っています。");
		}
		if(CommonUtils.isEmpty(this.userName)) {
			errors.put("user_name", "ユーザー名が必要です。");
		}
		
		if(CommonUtils.isEmpty(this.password)) {
			errors.put("password", "パスワードが必要です。");
		}
		
		return errors;
}
}
