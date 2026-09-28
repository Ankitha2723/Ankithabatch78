package com.myfirstcorejavaproject;

public class Car {
	String brand;
	String model;
	double price;
	int year;
	Car(){
		this("unknown");
	}
	Car(String brand){
		this(brand,"Abc");
	}
	Car(String brand,String model){
		this(brand,model,0.0);
	}
	Car(String brand,String model,double price){
		this(brand,model,price,2026);
	}
	Car(String brand,String model,double price,int year){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.year=year;
	}

	public static void main(String[] args) {
      System.out.println("main method started");
      Car c=new Car("maruthi","xxxxx",20000000,2026);
      c.carinfo();
	}
void carinfo() {
	System.out.println(brand);
	System.out.println(model);
	System.out.println(price);
	System.out.println(year);
}
}
