package com.logicalstatements;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*****************  MATRIMONY APPLICATION****************");
		System.out.println("enter your name :");
		String name=sc.nextLine();
		System.out.println("welcome :"+name);
		System.out.println("lets check your eligibility");
		System.out.println("enter your assets : ");
		Double assets=sc.nextDouble();
		if(assets>=500000) {
			System.out.println("good your assets meet the  our requirment");
			System.out.println("enter your salary :");
			Double salary=sc.nextDouble();
			if(salary>20000) {
				System.out.println("your salary meets the requirment");
                System.out.println("enter your age");
                int age=sc.nextInt();
                if(age>=25&&age<=28) {
                	System.out.println("your age is matched");
                	
                	System.out.println("enter yor height and weight");
                	double height=sc.nextDouble();
                	int weight=sc.nextInt();
                			if((height>=5.2&&height<=6.2)&&(weight>=62&&weight<=80)){
                				System.out.println("oh ok");
                				
                				System.out.println("do you have siblings");
                				Boolean sibligs=sc.nextBoolean();
                				if(!sibligs) {
                					System.out.println("thank god");
                				System.out.println("you are selected");
                				}else {
                					
                					System.out.print("oh my god");
                			
  	
                		
                			}
                			}else {
                				System.out.println("you need to go gym");
                			}
                }else {
                	
                	System.out.println("your age is not matched");
                }
				
				
			}else {
				System.out.println("sorry");
			}
		}else {
			System.out.println("your assets are less");
			
		}
	
}
}

			