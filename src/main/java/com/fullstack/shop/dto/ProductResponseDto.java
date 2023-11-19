package com.fullstack.shop.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductResponseDto {
	@JsonProperty("product_id")
	private long productId;
	@JsonProperty("product_name")
	private String productName;
	@JsonProperty("price")
	private int price;
	@JsonProperty("stock")
	private int stock;
	@JsonProperty("created_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp createdAt;
	@JsonProperty("updated_at")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	public Timestamp updatedAt;
}
