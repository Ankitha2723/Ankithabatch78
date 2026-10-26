package com.myfirstcorejavaproject;
//no return type +with parameter
public class Method5 {
	static void number(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}

	}
	static  void addition(int a ,int b) {
		int result=a + b;
		System.out.println(result);
	}
	static void subtraction(int a , int b) {
		int result=a-b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		number(10, 20);
		addition(20,11);
		subtraction(10,24);
	}

}
