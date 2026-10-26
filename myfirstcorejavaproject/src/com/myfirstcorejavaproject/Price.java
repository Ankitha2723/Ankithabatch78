package com.myfirstcorejavaproject;

public class Price {
	String name;
	int price;
	int quantity;
	Price(){
		
		this("unknown");
		
	}
	
	Price(String name){
		this(name,20);
	}
	Price(String name,int price){
		this(name,price,2);
	}
	Price(String name,int price,int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	public static void main(String[] args) {
		Price p1=new Price();
		p1.priceinfo();
		Price p2=new Price("laptop",2000000,12);
		p2.priceinfo();
		Price p3=new Price("phone",1200000,10);
		p3.priceinfo();



	}
	void priceinfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println("total:"+quantity * price);
	} 

}
