package com.myfirstcorejavaproject;

public class Method4 {
	static void area(int a) {
		double result = Math.PI * a * a;
		System.out.println(result);

	}
	static void details(String name,int age,String city) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
	}

	public static void main(String[] args) {
		area(20);
		details("ankitha",20,"hyd");
	}

}
