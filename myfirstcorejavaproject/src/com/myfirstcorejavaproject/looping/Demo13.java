package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=10;i>=n;i--) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
