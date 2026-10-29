package com.logicalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn="";
		do {
			System.out.println("enter a value :");
			int a=sc.nextInt();
			System.out.println("enter b value");
			int b=sc.nextInt();
			System.out.println("perform operations like + - * / %");
			String ys="";
			char c=sc.next().charAt(0);
			int result=0;
			switch(c) {
			case'+'-> result=a+b;
			case'-'-> result=a-b;
			case'*'-> result=a*b;
			case'/'-> result=a/b;
			case'%'-> result=a%b;
			default->System.out.println("invalide calculation");
			}
			System.out.println("calculation:" + result);
			System.out.println("do you  want to continue ..?click y for yes n for no");
			yn=sc.next();
			}while(yn.equalsIgnoreCase("y"));
		System.out.println("calcilation closed");

	}


		
			
			
		
		

	}


