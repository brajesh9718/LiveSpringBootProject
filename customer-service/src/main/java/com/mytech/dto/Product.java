package com.mytech.dto;

public class Product {

	int pid;
	String productName;
	double productPrice;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}

	
}
