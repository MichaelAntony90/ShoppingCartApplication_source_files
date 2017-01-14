package com.group.cart.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Product {

	int productId;
	String productName;
	String productPrice;
	String productDecription;

	public Product() {
	}

	public Product(int productId, String productName, String productPrice,String productDecription) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productId = productId;
		this.productDecription = productDecription;
	}

	@XmlElement
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	@XmlElement
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@XmlElement
	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@XmlElement
	public String getProductDecription() {
		return productDecription;
	}

	public void setProductDecription(String productDecription) {
		this.productDecription = productDecription;
	}
	
	

}
