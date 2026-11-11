package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

// given num is perfect or not 
//sum of factors is equals to given num is called perfect number

public class Perfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		boolean status=isPerfect(n);
		if(status) {
			System.out.println("given num is perfect");
		}else {
			System.out.println("no perfect");
		}
		
		
		// TODO Auto-generated method stub

	}
	static boolean isPerfect(int n) {
		boolean status=false;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		return status;
	}

}
