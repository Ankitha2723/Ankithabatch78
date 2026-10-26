package com.myfirstcorejavaproject;


class Vehicles{
	String type;
	Vehicles(String type){
		this.type=type;
		
	}
	
	
}

public class Car2 extends Vehicles {
	String brand;
	double price;
	Car2(String type,String brand,double price){
		super(type);
		this.brand=brand;
		this.price=price;
		
	}
	public static void main(String[] args) {
		Electriccar e1= new Electriccar("coupe","tata",200000.0,35);
		e1.display();
	}
	
}

	class Electriccar extends Car2{
		int  baterycapacity;

		Electriccar(String type, String brand, double price,int baterycapacity) {
			super(type, brand, price);
			this.baterycapacity=baterycapacity;
		}
		
		
	
	
		
		
	void display() {
		System.out.println("car type:"+type);
		System.out.println("car brand:"+brand);
		System.out.println("car price:"+price);
	    System.out.println("car capacity:"+baterycapacity);
	}
	}

	

