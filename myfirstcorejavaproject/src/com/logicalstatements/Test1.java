package com.logicalstatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("good");
			System.out.println("u are eligible for driving and voting");
		} else
			System.out.println("warning");
		System.out.println("not eligible");

		sc.close();

		// TODO Auto-generated method stub

	}

}
