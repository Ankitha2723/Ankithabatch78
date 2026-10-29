package com.logicalstatements;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select item");
		int item=sc.nextInt();
		System.out.println("enter quantity");
		int quantity=sc.nextInt();
		int price=0;
		int total=price*quantity;
		switch(item) {
		case 1->{
			System.out.println("pizza and price=280/-rs");
			int pizza_price=200;
			
			 total=pizza_price*quantity;
			
			}
		case 2->{
			System.out.println("burger and price=120/rs");
			int burger_price=120;
			price+=burger_price;
			total=burger_price*quantity;
		}
		
		case 3->{
			System.out.println("Biryani and price=180/rs");
			int Biryani_price=180;
			total=Biryani_price*quantity;
			//price+=Biryani_price;
		}
		case 4->{
			System.out.println("noodles and price=100/rs");
			int noodles_price=100;
			total=noodles_price*quantity;
			//price+=noodles_price;
		}
		default->System.out.println("enterd item is not available ");
		         
			
		}
		System.out.println("total_bill:"+total);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
