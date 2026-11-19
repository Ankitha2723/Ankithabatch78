package com.oops.inheritance;

import java.util.Scanner;

public class HomeLoan extends LoanImpl {
	static Scanner sc=new Scanner(System.in);
	void homeloaninfo() {
		System.out.println("all documents are verified");
	}

	public static void main(String[] args) {
		
		HomeLoan hl=new HomeLoan();
		if(hl.getAge()>25&&hl.getCibilscore()>=300&&hl.getSalary()>=100000&&hl.isAddaarvalid()&&hl.isPanValid()&&hl.isPhnoeValide()) {
			System.out.println("congratulations you are eligible for home loan");
			System.out.println("your rate of intrest is:" + hl.getRoi());
			hl.homeloaninfo();
		}else {
			System.out.println("focuson your career");
			System.out.println("soryy for inconvineancve");
		}
		// TODO Auto-generated method stub

	}

}
