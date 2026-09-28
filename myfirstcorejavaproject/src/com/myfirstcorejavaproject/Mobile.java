package com.myfirstcorejavaproject;

public class Mobile {
	String mobilemodel;
	int quantity;
	double price;
	int deliverrycharge;
	Mobile(){
		this(1);
		}
	Mobile(int quantity){
		this(quantity,"unknown");
	}
	Mobile(int quantity,String model){
		this(quantity,model,11);
	}
	
		Mobile(int quantity,String model,int charge){
			this(quantity,model,charge,0.0);
		}
		Mobile(int quantity,String model,int charge,double price){
			this.mobilemodel=model;
			this.quantity=quantity;
			this.price=price;
			this.deliverrycharge=charge;
		}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Mobile m=new Mobile(1,"redmi",20000,200);
		m.carinfo();
	}
	void carinfo(){

		System.out.println("mobilemodel:"+mobilemodel);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("deliverrycharge:"+deliverrycharge);

		
	}

}
