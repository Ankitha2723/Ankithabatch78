package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--){
			fact=fact*i;//TODO Auto-generated method stub
		}
		System.out.println(fact);

	}

}
