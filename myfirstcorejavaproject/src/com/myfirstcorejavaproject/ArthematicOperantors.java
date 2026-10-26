package com.myfirstcorejavaproject;

import java.util.Scanner;

public class ArthematicOperantors {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value:");

		int a=sc.nextInt();
		System.out.println("enter b value:");

		int b=sc.nextInt();
		
		System.out.println("addition of two numbers:"+(a+b));
		System.out.println("differance of two numbrs:"+(a-b));
		System.out.println("multiplication of two numbers:"+(a*b));
		System.out.println("division of two numbers:"+a/b);
		System.out.println(a%b);
		// TODO Auto-generated method stub

	}

}
