package com.myfirstcorejavaproject.looping;

import java.util.Scanner;
//factorial of given num
//input 4->1*2*3*4=24


public class Demo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.print(fact);
	}
}

