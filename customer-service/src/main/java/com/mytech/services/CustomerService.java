package com.mytech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytech.dto.MyOrders;
import com.mytech.dto.Product;
import com.mytech.entity.Customer;
import com.mytech.feignclient.ProductFeignCleintApp;
import com.mytech.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ProductFeignCleintApp feignCleint;
	
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	
	public Customer saveCustomer(Customer custOrder) {
		return customerRepo.save(custOrder);
	}
	
	public Customer getCustomerById(int id) {
		return customerRepo.findById(id).get();
	}
	
	public MyOrders getMyOrder(int id) {
		Customer customer = customerRepo.findById(id).get();
		Product product =  feignCleint.getProductById(customer.getPid());
		MyOrders myOrders = new MyOrders();
		myOrders.setCustomer(customer);
		myOrders.setProduct(product);
		return myOrders;
	}
	

}
