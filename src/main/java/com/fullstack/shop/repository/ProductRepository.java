package com.fullstack.shop.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fullstack.shop.dto.ProductRequestDto;
import com.fullstack.shop.dto.ProductResponseDto;

@Mapper
public interface ProductRepository {
	public void createProduct(ProductRequestDto productRequestDto);
	public ProductResponseDto getCreatedProduct(ProductRequestDto productRequestDto);
	public ArrayList<ProductResponseDto> getAllProducts();
	public ProductResponseDto getProductById(@Param("productId") int productId);
	public void deleteProductById(@Param("productId") int productId);
}
