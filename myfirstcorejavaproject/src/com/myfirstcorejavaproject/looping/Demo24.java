package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int square=n*n;
		int r=0;
		int sum=0;
		while(square>0) {
			r=square%10;
			square=square/10;
			sum=sum+r;
		}
		
		if(sum==n) {
			System.out.println("given number is neon number");
			
		}else {
			System.out.println("given number is not a neon number");
		}
		// TODO Auto-generated method stub

	}

}
