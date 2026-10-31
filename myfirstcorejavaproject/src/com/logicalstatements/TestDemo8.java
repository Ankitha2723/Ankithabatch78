package com.logicalstatements;

import java.util.Scanner;

public class TestDemo8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter connection type..such as  domestic/commercial");
		System.out.println("1.domestic");
		System.out.println("2.commercial");
		int type=sc.nextInt();
		System.out.println("enter units");
		int unit=sc.nextInt();
		double total=0;

	
		int rate=0;
		
		switch(type) {
				
			case 1->{
				if(unit<=100) {
					{
						rate=2;
					}
					
				}else  if(unit>100){
					{
						rate=3;
					
				}
				}
					else {
					System.out.println("invaliide units");
				
			}
				}
				case 2->{
					if(unit<=100) {
						{
							rate=4;
						}
					}
					else if(unit>100) {
						{
							rate=6;
						}
					}
						else {
							System.out.println("invalide units");
						}
					total=unit*rate;
							
					System.out.println("total bill:"+total);
					
				}
				default->System.out.println("invalide type");
				}
			
			
					
			
			 

	}

}
