package com.myfirstcorejavaproject;

public class Task2 {
	static int product(int a, int b) {
		return a * b;
	}

	static double area(int r) {
		return Math.PI * r * r;
	}

	static String name() {
		return "ANKITHA";
	}

	public static void main(String[] args) {
		//Task2 t1=new Task2();
	int prouct=product(10, 30);
	double area=area(20);
	String name=name();
	System.out.println(area);
	System.out.println(prouct);
	System.out.println(name);
		

	}

}
