package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

//write a program to print factors of given num
//input is 6
//output 1 2 3 6

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		factors(n);
	}
	static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
		
		
		// TODO Auto-generated method stub

	}


