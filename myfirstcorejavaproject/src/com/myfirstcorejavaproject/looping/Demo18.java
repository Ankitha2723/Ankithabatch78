package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n +  "*" + i + "="+n*i);
		}
		
		// TODO Auto-generated method stub

	}

}
