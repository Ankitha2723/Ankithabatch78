package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			if(i%5==0 && i%3==0) {
				System.out.println("fizz"+"buzz");
			}
			else if(i%5==0) {
				System.out.println("fizz");
			}else if(i%3==0) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
		// TODO Auto-generated method stub

	}

}
