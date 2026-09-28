package com.myfirstcorejavaproject;


class Vehicle{
	//model="aaaa";
	
	Vehicle(){
		System.out.println("main method started from ve");
	}
	{
		System.out.println("instance block called");
	}
	
	public static void main(String[] args)  {
		System.out.println("main method started from vechile");
		
	}
	
}

public class Bike extends Vehicle {
	Bike(){
		System.out.println("no arg constructor called");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started from bike");
		Bike c=new Bike();
	
		// TODO Auto-generated method stub

	}
	void Bikeinfo() {
		System.out.println(model);
			
		}
	}

}
