package com.mytech.fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFallbackController {

	@GetMapping("/customerService")
	public String customerService() {
		return "Customer service is down ....!!!!";
	}

	@GetMapping("/productService")
	public String productService() {
		return "Product service is down ....!!!!";
	}

}