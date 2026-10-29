package com.logicalstatements;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a chracter");
		String letter=sc.nextLine().toLowerCase();
		switch(letter) {
		case"a":
			System.out.println("vowel");
			break;
		case"e":
			System.out.println("vowel");
			break;
			
		case"i":
			System.out.println("vowel");
			break;
		case"o":
			System.out.println("vowel");
			break;
		case"u":
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
		
		
		}
		// TODO Auto-generated method stub

	}

}
