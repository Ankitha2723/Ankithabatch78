package com.oops;

public class TestAccount1 {
	public static void main(String[] args) {
	Account1 a=new Account1();
	a.setAccountNumber(234567);

	a.setName("Ankitha");
	a.deposit(60000);
	a.withdraw(20000);
	
	System.err.println(a.getAccountNumber());
	System.out.println("available balance :"+a.getBalance());
	System.out.println(a.getName());

}
}
