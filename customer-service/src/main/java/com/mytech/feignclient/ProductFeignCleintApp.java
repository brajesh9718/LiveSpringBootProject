package com.mytech.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mytech.dto.Product;

@FeignClient(value  = "PRODUCT-SERVICE")
public interface ProductFeignCleintApp {

	@GetMapping("/product/productById/{id}")
	public Product getProductById(@PathVariable int id);
}
