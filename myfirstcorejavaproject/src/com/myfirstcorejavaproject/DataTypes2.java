package com.myfirstcorejavaproject;

public class DataTypes2 {
	

	int emid;
	int age;
	int emsal;
	char grade;
	int exp;
	boolean active;
	int noleaves;
	long phno;
	
	void display() {
		System.out.println(emid);
		System.out.println(age);
		System.out.println(emsal);
		System.out.println(grade);   
		System.out.println(exp);
		System.out.println(active);
		System.out.println(noleaves);
		System.out.println(phno);

	}
	

	public static void main(String[] args) {
		DataTypes2 t1=new DataTypes2();
		t1.emid=11;
		t1.age=12;
		t1.emsal=200000;
		t1.grade='A';
		t1.exp=2;
		t1.active=true;
		t1.noleaves=2;
		t1.phno=8555031709L;
		t1.display();
		DataTypes2 t2=new DataTypes2();	
		t2.emid=10;
		t2.age=9;
		t2.emsal=205000;
		t2.grade='B';
		t2.exp=3;
		t2.active=false;
		t2.noleaves=3;
		t2.phno=8555031703L;
		t2.display();
		t1.display();
		

	// TODO Auto-generated method stub

}

}
