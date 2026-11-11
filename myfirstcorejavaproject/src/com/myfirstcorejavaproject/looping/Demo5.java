package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

//print factorial of given number using recursion

public class Demo5 {

	public static void main(String[] args) {
		System.out.println("main methgod dsatrted");
		Scanner sc=new Scanner(System.in);
		System.out.println("emter a number");
		int n=sc.nextInt();
		int f = fact(n);
		System.out.println("factorial of given number is :" + f);
		
		
		// TODO Auto-generated method stub

	}
	static int fact(int n ){
		if(n==0 || n==1) {
			return 1;
		}
		return n*(fact(n-1));
	}

}
