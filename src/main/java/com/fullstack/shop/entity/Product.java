package com.fullstack.shop.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Product {
	private long productId;
	private String productName;
	private int price;
	private int stock;
	public Timestamp createdAt;
	public Timestamp updatedAt;
}
