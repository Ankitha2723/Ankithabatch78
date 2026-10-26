package com.myfirstcorejavaproject;

import java.util.Scanner;

public class TestlDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks :");
		int marks=sc.nextInt();
		if(marks<=0||marks>100) {
			System.out.println("invalid marks");
		}else if(marks>=90) {
			System.out.println("A grade");
		
		}else if (marks>=80) {
			System.out.println("B grade");
		}else if (marks>=70) {
			System.out.println("c grade");
				
			}else if (marks>=60) {
				System.out.println("D grade");
			}
		else {
				System.out.println("fail");
			}
				
			}
}
		
			
		
			