package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

// is prime  umbers

public class TestDemo {
	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0||n==1) {
			return false;
			
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length size");
		int size=sc.nextInt();
		int [] number=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<number.length;i++) {
			number[i]=sc.nextInt();
		}
			for(int n:number) {
			if(isPrime(n)) {
				System.out.println(n);
				
			}
			//System.out.println(n);
			
			
			
		}
		
		// TODO Auto-generated method stub

	}
	}



