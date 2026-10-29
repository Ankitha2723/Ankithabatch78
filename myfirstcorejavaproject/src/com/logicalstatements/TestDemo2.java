package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name :");
		String name=sc.nextLine();
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("valid age for voting ");
			
			System.out.println("are you Indian....?");
			Boolean Indiancitizen=sc.nextBoolean();
			if(Indiancitizen) {
				System.out.println("you are  eligible to vote");
				
				System.out.println("do you have voterId");
				Boolean voterId=sc.nextBoolean();
				if(voterId) {
					System.out.println("eligible to vote");
				}else {
						System.out.println("voter Id is required for voting");
					}
				
			}else {
				System.out.println("Not eligible to vote");
			}
		}else {
			System.out.println("in valide age");
		}
		// TODO Auto-generated method stub

	}

}
