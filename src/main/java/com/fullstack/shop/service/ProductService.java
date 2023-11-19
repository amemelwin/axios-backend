package com.fullstack.shop.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fullstack.shop.dto.ProductRequestDto;
import com.fullstack.shop.dto.ProductResponseDto;
import com.fullstack.shop.repository.ProductRepository;
import com.fullstack.shop.response.ApiErrorResponse;
import com.fullstack.shop.response.ApiResponse;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public ResponseEntity<Object> createProduct(ProductRequestDto productRequestDto){
		Map<String,Object> errors = productRequestDto.validate();
		if(errors.size()>0) {
			return new ApiErrorResponse(HttpStatus.CONFLICT,"Can not create product", errors).response();
		}
		try {
			productRepository.createProduct(productRequestDto);
			return new ApiResponse(HttpStatus.CREATED, "Product Created",productRepository.getCreatedProduct(productRequestDto)).response();
		}catch(Exception e) {
			return new ApiResponse(HttpStatus.CONFLICT, "Error").response();
		}
	}
	
	public ResponseEntity<Object> getAllProducts(){
		return new ApiResponse(HttpStatus.OK,"Success", productRepository.getAllProducts()).response();
	}
	
	public ResponseEntity<Object> getProductById(int productId){
		ProductResponseDto product = productRepository.getProductById(productId);
		if(product != null) {
			return new ApiResponse(HttpStatus.OK, "OK",product).response();
		}else {
			return new ApiResponse(HttpStatus.NOT_FOUND, "Product Not Found").response();
		}
	}
	

}
