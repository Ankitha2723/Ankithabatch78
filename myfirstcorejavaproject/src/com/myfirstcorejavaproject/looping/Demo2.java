package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		factors(n);
		// TODO Auto-generated method stub

	}
	static void factors(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
		System.out.println(""+n);
	}

}
