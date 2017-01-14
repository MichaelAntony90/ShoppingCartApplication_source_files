package com.group.cart.controller;

import static com.group.cart.util.ProductListsUtil.getAvailableProducts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.cart.bean.Product;
import com.group.cart.bean.ProductList;

@RestController
public class ProductController {
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	@ResponseBody
	public ProductList getProducts() {
		ProductList prodList = getAvailableProducts();
		return prodList;
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProductById(@PathVariable int id) {

		List<Product> productList = new ArrayList<Product>();
		ProductList prodList = getAvailableProducts();
		productList = prodList.getListOfProducts();

		for (Product prd : productList) {
			if (prd.getProductId() == id) {
				return prd;
			}
		}

		return null;
	}

}
