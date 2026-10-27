package com.logicalstatements;

import java.util.Scanner;

public class Noukri {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*************** NOUKRI JOB APPLICATION ***********************");
		System.out.println("enter your name");
		String name=sc.nextLine();
		
		System.out.println("enter your qualification");
		String qualification=sc.nextLine();
		if(qualification.equalsIgnoreCase("BTech")) {
			System.out.println("qualification accepted");
		
			System.out.println("enter your year of passing");
			int date=sc.nextInt();
			if(date>=2022&&date<=2026) {
				System.out.println("ok good !");
			
			
			
			   sc.nextLine();
				System.out.println("enter your skills");
				String skills=sc.nextLine();
				if(skills.equalsIgnoreCase("java")||skills.equalsIgnoreCase("python")||skills.equalsIgnoreCase("mysql")) {
					System.out.println("your skills are match our requirments");
				
					System.out.println("enter your percentage :");
					float percentage=sc.nextFloat();
					if(percentage>=65 && percentage<=100) {
						System.out.println("oh nice lets check another details");
					
						System.out.println("enter your experiance");
					    int experiance=sc.nextInt();
					    if(experiance>=0 && experiance<=4) {
					    	System.out.println("experiance requirment satisfied");
					    
					   System.out.println("your salary expectations per month :");
					    	int salary=sc.nextInt();
					    	if(salary>=30000 && salary<=60000) {
					    		System.out.println("your expectations match our requirments");
					    	    System.out.println();
					    		System.out.println("congratulation" +"   "+ name+"!!");
					    		System.out.println("you are eligible to apply for the  software developer job");
					    	}else {
					    		
					    	System.out.println("yor salary expectations are not matched our requirements");
					    
					    	System.out.println("you are not eligible to apply for this job");
					    	}
					    }else {
					    	System.out.println("Your experience does not match our requirements");
					    	
					    	
					    	
					    }
					}else {
						System.out.println("your percentage is less");
					}
				}else {
					System.out.println("Your skills do not match our requirements");
				}
			}else {
				System.out.println("does nt match");
			}
					    
					    }else {
					    	System.out.println("Sorry, this job requires a BTech qualification");
					    }
					    	
	}
	}



