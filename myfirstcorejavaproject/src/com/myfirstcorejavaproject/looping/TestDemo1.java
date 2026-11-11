package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0) {
			count++;
			System.out.println(i);
			
		}
		
		
		// TODO Auto-generated method stub

	}
		System.out.println(count);

	}
}
