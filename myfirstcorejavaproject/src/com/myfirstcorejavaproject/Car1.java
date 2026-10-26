package com.myfirstcorejavaproject;

public class Car1 {
	String brand;
	int year;
	Car1(){
		this("unknown");
	}
	Car1(String brand){
		this(brand,2020);
	}
	Car1(String brand,int year){
		this.brand=brand;
		this.year=year;
	}

	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.carinfo();
		Car1 c2=new Car1("toyato",2025);
		c2.carinfo();
		Car1 c3=new Car1("bmw",2026);
		c3.carinfo();
		// TODO Auto-generated method stub

	}
	void carinfo() {
		System.out.println(brand);
		System.out.println(year);
	}

}
