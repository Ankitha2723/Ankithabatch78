package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(fabbi(i));
			}
			
		}
		
		// TODO Auto-generated method stub

	
	static int fabbi(int n) {
		if(n==0) {
			return 0;
			
		}
		if(n==1) {
			return 1;
		}
		return( fabbi (n-1) + fabbi(n-2));
	}

}
