package com.ashokit.entity;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tbl_product")
public class Products {

	@Id
	@Column(name="product_id")
	private Integer productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_price")
	private Double productPrice;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(Integer productId, String productName, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}	
	
}
