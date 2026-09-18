package com.myfirstcorejavaproject;

public class Task1 {
	int emid;
	String ename;
	int emsal;
	
	
	void display() {
		System.out.println("employee id:"+emid);
		System.out.println("employe name:"+ename);
		System.out.println("employee sal:"+emsal);


		
		
	}

	public static void main(String[] args) {
		Task1 em1=new Task1();
		em1.emid=22;
		em1.ename="Ankitha";
		em1.emsal=400000;
		Task1 em2=new Task1();
		em2.emid=222;
		em2.ename="Ankith";
		em2.emsal=405000;
		Task1 em3=new Task1();
		em3.emid=223;
		em3.ename="mahi";
		em3.emsal=500000;
		em1.display();
		em2.display();
		em3.display();
		

		
		
		// TODO Auto-generated method stub

	}

}
