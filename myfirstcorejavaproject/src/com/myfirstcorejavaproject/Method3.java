package com.myfirstcorejavaproject;
//no return type + no prameter types
public class Method3 {
	static void details() {
		System.out.println("name=ankitha");
		System.out.println("age=20");
		System.out.println("city=hyd");
	}
	static void number() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	static void evennum() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
			
		}
	}
	static void oddnum() {
		for(int i=1;i<=20;i+=1) {
			System.out.println(i);
		}
	}
	static void addition() {
		int a=20;
		int b=30;
		int sum=a+b;
		
			System.out.println(sum);
		
	}
	static void subtraction() {
		int a=25;
		int b=50;
		int result=a -b;
		System.out.println(result);
	}

	static void multiplication() {
		int a=30;
		int b=40;
		int result=a * b ;
		System.out.println(result);
	}
	static void division() {
		int a =20;
		int b=15;
		int result=a/b;
		System.out.println(result);
	}
	static void  suare() {
		int n=5;
		int result=n * n * n;
		System.out.println(result);
	}
	static void area() {
		double r=7;
		double area=Math.PI  * r * r;
		System.out.println(area);
	}
	static void rect() {
		double length=20;
		double breadth=30;
		double result=length * breadth;
		System.out.println(result);
	}
	public static void main(String[] args) {
		details();
		number();
		evennum();
		oddnum();
		addition();
		subtraction();
		multiplication();
		division();
		suare();
		area();
		rect();
	}

}
