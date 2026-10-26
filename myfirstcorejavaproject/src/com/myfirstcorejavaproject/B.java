package com.myfirstcorejavaproject;
class A{
	A(){
		System.out.println("A constructor");
		}
	
}

public class B extends A {
	B(){
		System.out.println("B constructor");
	}
	public static void main(String[] args) {
		B b1=new B();
	}

}
