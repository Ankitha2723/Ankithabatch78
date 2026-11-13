package com.oops;

public class Account {
	private long accountnumber;
	private double balance;
	private String name;
	public  void setAccountNumber(long accountnumber) {
		this.accountnumber=accountnumber;
		
	}
	public long getAccountNumber() {
		return accountnumber;
	}
	public void setbalance(double balance) {
		if(balance>0) {
		this.balance=balance;
		}else {
			System.out.println("invalde balance");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
		
	}

}
