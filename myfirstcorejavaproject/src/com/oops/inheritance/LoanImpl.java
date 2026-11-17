package com.oops.inheritance;

import java.util.Scanner;

public class LoanImpl {
	static Scanner sc = new Scanner(System.in);


	boolean isAddaarvalid() {
		boolean status = false;

		System.out.println("enter your adaar number");
		String adhaar = sc.next();
		status = adhaar.matches("[2-9] {1}[1-9] {11}");
		return status;

	}

	boolean isPanValid() {
		boolean status = false;
		System.out.println("enter your pan number");
		String pannumber = sc.next();
		status = pannumber.matches("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-z]{1}");
		return status;

	}

	boolean isPhnoeValide() {
		boolean status = false;
		System.out.println("enter your valide phn number");
		String phnnum = sc.next();
		status = phnnum.matches("[6-9] {1}[0-9] {9}");
		return status;
	}

	int getAge() {
		System.out.println("ener your age");
		int age = sc.nextInt();
		return age;
	}

	double getSalary() {
		System.out.println("enter your salary");
		double salary = sc.nextInt();
		return salary;
	}

	double getRoi() {
		double ROI = 20.0;
		int cibil = getCibilscore();
		if (cibil > 900 || cibil < 300) {
			System.out.println("cobil data is invalide");
		} else if (cibil >= 800 && cibil <= 900) {
			System.out.println("strong ctredit profile,bestloan term :+ Excelent");
			ROI = ROI - 11.0;
		} else if (cibil > 770 && cibil < 800) {
			System.out.println("high approvali chances,compitatives rates:+good");
			ROI = ROI - 9.0;
		} else if (cibil > 700 && cibil < 770) {
			System.out.println("eligible for most loans ");
			ROI = ROI - 8.0;
		} else if (cibil > 600 && cibil < 700) {
			System.out.println("may get loans but at higher intrest:+average");
			ROI = ROI - 7.0;
		} else {
			System.out.println("high risk,loan application often rejected");
		}
		return ROI;

	}

	int getCibilscore() {
		System.out.println("enter your cibil score");
		int cibil = sc.nextInt();
		return cibil;
		// TODO Auto-generated method stub

	}
}
