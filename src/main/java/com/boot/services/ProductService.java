package com.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.SpringBootApp.pojo.Product;
import com.boot.dao.ProductDAO;

@Service
public class ProductService {
	@Autowired
	private ProductDAO dao;
	
	public void insertProduct(Product product) {
		dao.save(product);
	}
	
	public List<Product> getProducts(){
		return (List<Product>) dao.findAll();
	}
}
