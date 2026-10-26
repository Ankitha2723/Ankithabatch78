package com.myfirstcorejavaproject;

import static java.lang.System.out;

public class Product {
	int productid;
	String productname;
	double price;
	int quantity;

	Product(int productid, String productname, double price, int quantity) {
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
	}

	Product(Product p1, int quantity) {
		this.productid = p1.productid;
		this.productname = p1.productname;
		this.price = p1.price;
		this.quantity = quantity;

	}

	void calculatetotal() {
		double total = price * quantity;
		out.println("total:" + total);
		// return total;
	}

	void display() {
		out.println("productid:" + productid);
		out.println("productname:" + productname);
		out.println("price:" + price);
		out.println("quantity:" + quantity);
		// System.out.println("total:"+ calculatetotal());
	}

	public static void main(String[] args) {
		Product p1 = new Product(10, "laptop", 45000, 2);
		p1.display();
		p1.calculatetotal();
		out.println("**********second product**************");
		Product p2 = new Product(p1, 3);
		p2.display();
		p2.calculatetotal();

	}

}
