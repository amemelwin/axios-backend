package com.fullstack.shop.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fullstack.shop.dto.OrderDetailResponseDto;
import com.fullstack.shop.dto.OrderResponseDto;
import com.fullstack.shop.dto.OrderUpdateRequestDto;
import com.fullstack.shop.dto.UserResponseDto;
import com.fullstack.shop.repository.AuthRepository;
import com.fullstack.shop.repository.OrderRepository;
import com.fullstack.shop.response.ApiErrorResponse;
import com.fullstack.shop.response.ApiResponse;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	AuthRepository authRepository;
	
	public ResponseEntity<Object> getOrders(){
		ArrayList<OrderResponseDto> orders =  orderRepository.getOrders();
		
		for(OrderResponseDto order:orders) {
			UserResponseDto user = (UserResponseDto) authRepository.getUserById(order.getUserId()).toDto();
			order.setUser(user);
			ArrayList<OrderDetailResponseDto> orderDetails = orderRepository.getOrderDetailsByOrderId(order.getOrderId());
			order.setOrderDetails(orderDetails);
		}
		return new ApiResponse(HttpStatus.OK,"Ok",orders).response();
	}
	
	public ResponseEntity<Object> updateOrder(long orderId,OrderUpdateRequestDto orderUpdate){
		Map<String,Object> errors = orderUpdate.validate();
		if(errors.size()>0) {
			return new ApiErrorResponse(HttpStatus.CONFLICT,"Failed Updated: ",errors).response();
		}
		try {
			orderRepository.updateOrder(orderId, orderUpdate.getStatus());
			OrderResponseDto order = orderRepository.getOrdersById(orderId);
			UserResponseDto user = (UserResponseDto) authRepository.getUserById(order.getUserId()).toDto();
			order.setUser(user);
			ArrayList<OrderDetailResponseDto> orderDetails = orderRepository.getOrderDetailsByOrderId(order.getOrderId());
			order.setOrderDetails(orderDetails);
			
			return new ApiResponse(HttpStatus.OK,"Successfully Updated: ",order).response();

			
		}catch(Exception e){
			return new ApiResponse(HttpStatus.CONFLICT,"Failed Updated: "+orderId,orderUpdate).response();

		}
	}
}
