package com.logicalstatements;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num ");
		int n=sc.nextInt();
		System.out.println("how many times you want to print...?");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n + " * "+ i + " = " + (n*i));
		}
		
		// TODO Auto-generated method stub

	}

}
