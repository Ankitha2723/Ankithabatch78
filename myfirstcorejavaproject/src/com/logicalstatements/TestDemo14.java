package com.logicalstatements;

import java.util.Scanner;

public class TestDemo14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				sum+=i;
			
			}
			
		}
		System.out.println(sum);
	}

}
