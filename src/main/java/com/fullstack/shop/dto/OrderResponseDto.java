package com.fullstack.shop.dto;

import java.sql.Timestamp;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderResponseDto {
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("user_id")
	private long userId;
	@JsonProperty("user")
	private UserResponseDto user;
	@JsonProperty("status")
	private int status;
	@JsonProperty("order_details")
	private ArrayList<OrderDetailResponseDto> orderDetails;
	@JsonProperty("created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp createdAt;
	@JsonProperty("updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp updatedAt;
}
