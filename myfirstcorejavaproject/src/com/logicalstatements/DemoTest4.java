package com.logicalstatements;

import java.util.Scanner;

public class DemoTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your marks");
		int marks = sc.nextInt();
		String result = (marks < 0 || marks < 100) ? "invalide marks"
				: (marks >= 90 && marks < 100) ? "A grade"
						: (marks >= 80 && marks <= 89) ? "B grade"
								: (marks >= 70 && marks < 89) ? "c grade"
										: (marks >= 60 && marks < 70) ? "d grade"
												: (marks >= 35 && marks > 60) ? "fail" : "e grade";
		System.out.println(result);

		// TODO Auto-generated method stub

	}

}
