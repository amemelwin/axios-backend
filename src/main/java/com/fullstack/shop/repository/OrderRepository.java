package com.fullstack.shop.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.fullstack.shop.dto.OrderDetailResponseDto;
import com.fullstack.shop.dto.OrderResponseDto;

@Mapper
public interface OrderRepository {
	public ArrayList<OrderResponseDto> getOrders();
	public ArrayList<OrderDetailResponseDto> getOrderDetailsByOrderId(@Param("orderId") long orderId);
	public void updateOrder(@Param("orderId") long orderId,@Param("status") int status);
	public OrderResponseDto getOrdersById(@Param("orderId") long orderId);
}
