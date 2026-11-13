package com.oops;

public class TestAccount {

	public static void main(String[] args) {
		Account a=new Account();
		a.setAccountNumber(234567);
		a.setbalance(-200000);
		a.setName("Ankitha");
		System.err.println(a.getAccountNumber());
		System.out.println(a.getBalance());
		System.out.println(a.getName());
		// TODO Auto-generated method stub

	}

}
