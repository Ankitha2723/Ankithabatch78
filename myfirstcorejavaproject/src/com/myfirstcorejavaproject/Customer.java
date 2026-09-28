package com.myfirstcorejavaproject;


class Customer1{
	public static void main(String[] args) {
		System.out.println("customer1 called");
		
	}
//	System.out.println("customer1 calls");
}

public class Customer {
	Customer(){
		System.out.println("no_ arg constructor");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Customer c1=new Customer();
		System.out.println("main method ended");
	}

}
