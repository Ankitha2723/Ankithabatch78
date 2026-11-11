package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

//WAp to print prime numbers

public class Demo11 {
	static boolean isprime(int n) {
		 boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			status=false;
			break;
		}
		}
		return status;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		for( int i=0;count<n;i++){
			
			if(isprime(i)) {
				count++;
				//System.out.println(i + "-" + count);
			
			if(count==n) {
				System.out.println(n + "-"+ i);
				break;
			}
			
		}
		// TODO Auto-generated method stub

	}

}
}
