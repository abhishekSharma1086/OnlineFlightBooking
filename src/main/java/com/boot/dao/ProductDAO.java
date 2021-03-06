package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.SpringBootApp.pojo.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer>{

}
