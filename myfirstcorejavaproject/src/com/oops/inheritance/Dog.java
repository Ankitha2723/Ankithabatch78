package com.oops.inheritance;
class Animal{
	void eat() {
		System.out.println("main methos strated from Animal");
	}
}

public class Dog  extends Animal{
	void barks() {
		System.out.println("main method started from dog");
	}

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.barks();
		d1.eat();
		
		// TODO Auto-generated method stub

	}

}
