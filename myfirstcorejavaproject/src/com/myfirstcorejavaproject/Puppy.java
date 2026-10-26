package com.myfirstcorejavaproject;

class Animal3{
	Animal3(){
		System.out.println("call from Animal");
	}
}
class Dog2 extends Animal3 {
	
	
	Dog2(){
		System.out.println("call from dog2");
	}
}

public class Puppy extends Dog2 {
	Puppy(){
		System.out.println("call from puppy");
		
	}

	public static void main(String[] args) {
		Puppy p1= new Puppy();

	}

}
