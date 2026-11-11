package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(n>i) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
			//System.out.println(sum);
		}
		if(sum==n&&n>0) {
			System.out.println("given number is perfect");
		}else {
			System.out.println("given num is not perfect");
		}
		
			
		}
		// TODO Auto-generated method stub

	}


