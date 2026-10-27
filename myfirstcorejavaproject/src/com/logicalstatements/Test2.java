package com.logicalstatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a= sc.nextInt();
		System.out.println("entaer b value :");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("a :" + a);
		System.out.println("b:" +b);
		// TODO Auto-generated method stub

	}

}
