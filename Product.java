package com.edu;

public class Product {
	private int productId;
	private String productName;
	private float productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	//generate setter and getter method
	
	public void displayProductDetails() {
		System.out.println("Product Id="+productId);
		System.out.println("Product Name="+productName);
		System.out.println("Product Price="+productPrice);
	}
	

}
