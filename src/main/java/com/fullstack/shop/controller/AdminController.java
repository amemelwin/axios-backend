package com.fullstack.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.shop.dto.OrderUpdateRequestDto;
import com.fullstack.shop.dto.ProductRequestDto;
import com.fullstack.shop.service.OrderService;
import com.fullstack.shop.service.ProductService;

@RestController
public class AdminController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderService orderService;
	
	/* Products */
	@PostMapping("/api/v1/admin/products")
	public ResponseEntity<Object> createProduct(@RequestBody ProductRequestDto productRequestDto){		
		return productService.createProduct(productRequestDto);
	}
	
	@GetMapping("/api/v1/admin/products")
	public ResponseEntity<Object> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/api/v1/admin/products/{id}")
	public ResponseEntity<Object> getProductById(@PathVariable("id") int productId){
		return productService.getProductById(productId);
	}
	
	
	@DeleteMapping("/api/v1/admin/products/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable("id") int productId){
		return productService.deleteProductById(productId);
	}
	
	/* Orders */
	@GetMapping("/api/v1/admin/orders")
	public ResponseEntity<Object> getOrders(){
		return orderService.getOrders();
	}
	@PutMapping("/api/v1/admin/orders/{id}")
	public ResponseEntity<Object> updateOrder(@PathVariable("id") long orderId,@RequestBody OrderUpdateRequestDto orderUpdate){
		return orderService.updateOrder(orderId, orderUpdate);
	}
	

}
