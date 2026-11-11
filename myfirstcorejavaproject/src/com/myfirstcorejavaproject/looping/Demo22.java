package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		while(n>9) {
			int sum=0;
			int r=0;
			while(n>0) {	
			
			r=n%10;
			n=n/10;
			sum=sum+r;
			}
			n=sum;
		}
			if(n==1) {
				System.out.println("given number is magical num");
			}else {
				System.out.println("given num is not magical num");
			}
			
		}
		
		// TODO Auto-generated method stubSys

	}

	


