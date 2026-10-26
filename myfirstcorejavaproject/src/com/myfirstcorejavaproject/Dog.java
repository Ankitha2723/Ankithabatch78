package com.myfirstcorejavaproject;

class Cat1{
	Cat1(){
		System.out.println("no arh constructor called from ANimal");
	}

	public static void main(String[] args) {
		
	
	
	System.out.println("Animal constructor");
}
}

public class Dog extends Cat{
	Dog(){
		System.out.println("no arg constructoe called");
	
	}
	public static void main(String[] args) {
		System.out.println("dog constructor");
		Dog d1=new Dog();

	}

}
