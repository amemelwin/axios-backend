package com.fullstack.shop.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fullstack.shop.utiltiy.CommonUtils;
import com.fullstack.shop.utiltiy.StdRequestDto;

import lombok.Data;

@Data
public class ProductRequestDto implements StdRequestDto {
	
	@JsonProperty("product_name")
	private String productName;
	@JsonProperty("price")
	private int price;
	@JsonProperty("stock")
	private int stock;
	
	
	
	@Override	
	public Map<String, Object> validate() {
		Map<String,Object> errors = new HashMap<>();
		// check for product name
		if(CommonUtils.isEmpty(productName)) {
			errors.put("product_name", "Product name is reqired");
		}			
		// check for product price
		if(price <1) {
			errors.put("price", "Wrong price");
		}
				
		// check for product stock
		if(stock <1) {
			errors.put("stock","Wrong stock");
		}
	
		return errors;
	}
	

}
