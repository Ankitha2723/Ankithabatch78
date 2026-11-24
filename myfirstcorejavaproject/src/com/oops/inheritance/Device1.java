package com.oops.inheritance;

public class Device1 {
	private String  brand;
	private double price;
	
	public void setbrand(String brand) {
		this.brand=brand;
		
		
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String getbrand() {
		return brand;
	}
	public double getprice() {
		return price;
	}
	public void display() {
		System.out.println("Brand :"+brand);
		System.out.println("price :"+price);
	}
	

}
