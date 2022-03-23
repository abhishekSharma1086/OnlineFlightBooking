package com.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.SpringBootApp.pojo.Product;
import com.boot.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping("/create")
	public void createProduct(@RequestBody Product product) {
		service.insertProduct(product);
	}
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
}
