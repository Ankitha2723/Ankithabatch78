package com.myfirstcorejavaproject;

public class Bike1 {
	String brand;
	int price;
	Bike1(Bike1 b1){
		this.brand=b1.brand;
		this.price=b1.price;
	}
	Bike1(String brand,int price){
		this.brand=brand;
		this.price=price;
		}

	public static void main(String[] args) {
		Bike1 b1=new Bike1("honda",120000);
		b1.display();
		Bike1 b2=new Bike1(b1);
		b2.display();

		// TODO Auto-generated method stub

	}
	void display() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}

}
