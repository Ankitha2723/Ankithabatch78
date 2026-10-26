package com.myfirstcorejavaproject;

public class Bankaccount2 {
	int accountnum;
	String custoname;
	String actype;
	double balance;
	Bankaccount2(int accountnum,String cname,String actype,double balance){
		this.accountnum=accountnum;
		this.custoname=cname;
		this.actype=actype;
		this.balance=balance;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
        Bankaccount2 b1=new Bankaccount2(101,"ankitha","savings",30000);
		b1.bankinfo();
        Bankaccount2 b2=new Bankaccount2(1022,"mahesh","current",500000);
        b2.bankinfo();

		
		// TODO Auto-generated method stub

	}
	void bankinfo() {
		System.out.println(accountnum);
		System.out.println(custoname);
		System.out.println(actype);
		System.out.println(balance);
	}

}
