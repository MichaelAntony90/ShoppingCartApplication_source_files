package com.group.cart.bean;

import java.util.List;

public class ProductList {

	List<Product> ListOfProducts;

	public ProductList() {
		super();
	}

	public ProductList(List<Product> listOfProducts) {
		this.ListOfProducts = listOfProducts;
	}

	public List<Product> getListOfProducts() {
		return ListOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		ListOfProducts = listOfProducts;
	}

}
