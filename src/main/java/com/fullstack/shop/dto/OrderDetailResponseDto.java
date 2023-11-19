package com.fullstack.shop.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class OrderDetailResponseDto {
	@JsonProperty("order_detail_id")
	private long orderDetailId;
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("product_id")
	private long productId;
	@JsonProperty("qty")
	private int qty;
	@JsonProperty("created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp createdAt;
	@JsonProperty("updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp updatedAt;
}
