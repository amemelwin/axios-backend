package com.fullstack.shop.controller.user.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fullstack.shop.response.ApiResponse;
import com.fullstack.shop.service.ProductService;

@Controller
public class UserProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/api/v1/user/products")
	public ResponseEntity<Object> getProducts(){		
		return productService.getAllProducts();
	}

}
