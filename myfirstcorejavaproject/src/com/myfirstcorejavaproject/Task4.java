package com.myfirstcorejavaproject;

public class Task4 {
	 static Task4 t1= new Task4();
	
	static void addition(int a,int b) {
			System.out.println("addition ");
			
			int result=(a+b);
			System.out.println(result);
			t1.subtraction(result,5);
			
			
		}
	 void subtraction(int a,int b) {
			System.out.println(" subtaction");
			int result=(a-b);
			System.out.println(result);
			t1.multiplication(result,10);
			
		}
	 void multiplication(int a,int b) {
		 System.out.println("multiplication");
		 System.out.println(a * b);
		 int result = a*b;
		 t1.division(result,5);
		 
	 }
	 void division(int a,int b) {
		 System.out.println("divistion");
		 System.out.println(a/b);
		 int result = a/b;
		 
	 }

	public static void main(String[] args) {
	 System.out.println("main method started");
	
	 addition(10,20);
	}
	 
	 
	
		
	

}
