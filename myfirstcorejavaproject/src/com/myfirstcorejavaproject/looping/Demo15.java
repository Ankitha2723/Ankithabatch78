package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i*i);
		}
		// TODO Auto-generated method stub

	}

}
