package com.myfirstcorejavaproject;


class Animal4{
	
	    String name = "Animal";
	

	
	    
	}


public class Dog3 extends Animal4 {
	String name="dog";
	

	public static void main(String[] args) {
Dog3 d1=new Dog3();
d1.display();
	}
	void display() {
        System.out.println(name);
        System.out.println(super.name);
    }

}
