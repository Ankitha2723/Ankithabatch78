package com.oops;

public class Account1 {
	private long accountnumber;
    private String name;
    private double balance;
	public  void setAccountNumber(long accountnumber) {
		this.accountnumber=accountnumber;
		
	}
	public long getAccountNumber() {
		return accountnumber;
	}
	public void deposit(int amount) {
		if(amount>0) {
			balance=amount+balance;
			System.out.println("deposite ammount:"+amount);
		}else {
			System.out.println("invalide b alance");
		}
		}
	public  void withdraw(int amount) {
		if(amount>0&&amount<=balance) {
		balance=balance-amount;
		System.out.println("withdraw ammount:"+amount);
	}else {
		System.out.println("suffiesimnet balance :" + balance);
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



