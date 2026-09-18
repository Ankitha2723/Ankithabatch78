package com.myfirstcorejavaproject;

public class Bankaccount1 {
	static int balance=1000;

	public static void main(String[] args) {
		System.out.println("main method started");	
		deposite(500);
		withdraw(300);
		
			// TODO Auto-generated method stub
		}
	static void deposite(int b){
		 balance=balance + b;
		System.out.println(balance);
		

	}
	static void withdraw(int c) {
		balance=balance-c;
		System.out.println(balance);

}
}
