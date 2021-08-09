package com.mytech.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mytech.entity.Product;
import com.mytech.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello From Product Api !!!!";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping("/")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@GetMapping("/productById/{id}")
	public Product getProductById(@PathVariable int id) {
		log.info("Inside getProductById===================");
		return productService.getProductById(id);
	}

	
}
