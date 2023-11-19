package com.fullstack.shop.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fullstack.shop.utiltiy.StdRequestDto;

import lombok.Data;

@Data
public class OrderUpdateRequestDto implements StdRequestDto {
	@JsonProperty("status")
	private int status;

	@Override
	public Map<String, Object> validate() {
		Map<String,Object> errors= new HashMap<>();
		if(status>1 && status <4) {
		}else {
			errors.put("status", "Wrong input");
		}
		return errors;
	}
	
}
