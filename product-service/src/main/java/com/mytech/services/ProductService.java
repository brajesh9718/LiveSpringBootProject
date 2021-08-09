package com.mytech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytech.entity.Product;
import com.mytech.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	
	public Product getProductById(int id){
		return productRepo.findById(id).get();
	}
	
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
}
