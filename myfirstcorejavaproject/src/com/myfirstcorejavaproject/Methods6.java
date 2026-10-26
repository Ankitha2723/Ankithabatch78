package com.myfirstcorejavaproject;
//
public class Methods6 {
	static int addition(int a,int b) {
		return(a + b);
		
	}
	static int subtraction(int a, int b) {
		return(a -b);
	}
	static int multiplication(int a,int b) {
		return(a * b);
	}
	

	public static void main(String[] args) {
		int sum=addition(2,6);
		System.out.println(sum);
		int result=subtraction(4,7);
		System.out.println(result);
		int result2=multiplication(20,30);
		System.out.println(result2);

	}

}
