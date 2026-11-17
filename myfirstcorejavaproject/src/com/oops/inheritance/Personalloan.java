package com.oops.inheritance;

import java.util.Scanner;

public class Personalloan extends LoanImpl {
	static Scanner sc=new Scanner(System.in);
	void personalLoanInfo() {
		System.out.println("all documents have been verified");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube banking");
		Personalloan pl=new Personalloan();
		int  age=pl.getAge();
		double salary=pl.getSalary();
		int cibil=pl.getCibilscore();
		if(salary>=100000&&age>=23&&cibil>=300) {
			System.out.println("cpngratulations!! you are eligible for personalm loan");
			System.out.println("your rate of intrest is:"+pl.getRoi());
			
		}else {
			System.out.println("focus on your career");
			System.out.println("your loan got rejected");
		}
		
		// TODO Auto-generated method stub

	}

}
