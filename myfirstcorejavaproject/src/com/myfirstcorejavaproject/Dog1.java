package com.myfirstcorejavaproject;


class Animal2{
	Animal2(){
		System.out.println("no arg constructor from aNIMAL2");
	}
}

public class Dog1 extends Animal2 {
	Dog1(){
		System.out.println("no arg constructor call from dog");
	}
	

	public static void main(String[] args) {
		Dog1 d1=new Dog1();
		// TODO Auto-generated method stub

	}

}
