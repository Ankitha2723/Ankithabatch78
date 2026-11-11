package com.logicalstatements;

import java.util.Scanner;

public class TestDemo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter item");
		int item=sc.nextInt();
		System.out.println("enter quantity:");
		int quantity=sc.nextInt();
		double total_bill=0;
		switch(item) {
		case(1)->{
			System.out.println("pizza");
			int price=200;
			total_bill=price*quantity;
			
		}
		case(2)->{
			System.out.println("burger");
			int price=120;
			total_bill=price*quantity;
			
		}default->System.out.println("invalide item");
		}
		System.out.println(total_bill);
		
		}
		// TODO Auto-generated method stub

	}

