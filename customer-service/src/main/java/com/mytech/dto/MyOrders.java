package com.mytech.dto;

import com.mytech.entity.Customer;

public class MyOrders {

	private Customer customer;
	private Product product;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "MyOrders [customer=" + customer + ", product=" + product + "]";
	}
	
	
	
}
