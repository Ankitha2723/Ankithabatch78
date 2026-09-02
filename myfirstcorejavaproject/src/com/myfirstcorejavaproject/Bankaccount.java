package com.myfirstcorejavaproject;

public class Bankaccount {
	int acno;
	String acname;
	double balance;
	static int acnogen=15000;
	{
		acnogen++;
		acno=acnogen;
	}
	public static void main(String[] args) {
		Bankaccount ac1=new Bankaccount();
		ac1.acname="Ankitha";
		ac1.balance=20000;
		System.out.println(ac1.acno);
		System.out.println(ac1.acname);
		System.out.println(ac1.balance);
		Bankaccount ac2=new Bankaccount();
		ac2.acname="Anshu";
		ac2.balance=25000;
		System.out.println(ac2.acno);
		System.out.println(ac2.acname);
		System.out.println(ac2.balance);
		

		

	}

}
