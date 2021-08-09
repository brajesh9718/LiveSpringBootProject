package com.mytech.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytech.dto.MyOrders;
import com.mytech.entity.Customer;
import com.mytech.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/hello")
	public String msg() {
		return "Hello from Customer Service Api !!!!";
		
	}
	
	@GetMapping("/")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer custOrder) {
		return customerService.saveCustomer(custOrder);
	}
	
	@GetMapping("/customerById/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/myorders/{id}")
	public MyOrders getMyOrders(@PathVariable int id ) {
		return customerService.getMyOrder(id);
	}
}
