package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Product;
import com.cg.service.Productservice;
@RestController
@RequestMapping("/productapi")

public class Productcontroller extends Productservice {
		

		@Autowired

		private Productservice service;

		

		@PostMapping("/")

		public String addProduct(@RequestBody Product p){

			 return service.addProduct(p);

		}

		

		@GetMapping("/")

		public List<Product> getAll(){

			return service.getProductList();

		}

		

	}
	


