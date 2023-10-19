package com.cg.service;

import java.util.List;
import java.util.*;

import com.cg.dao.ProductDao;
import com.cg.entity.Product;

public class Productservice implements ProductDao {
	
	List<Product> products = new ArrayList<Product>();

	@Override
	public String addProduct(Product product) {
		products.add(product);
		return "Product added Successfully";
	}

	@Override
	public List<Product> getProductList() {
		
		return products;
	}
	

}
