package com.myfirstcorejavaproject;

public class Employee {
	int emid;
	String ename;
	double sal;
	Employee(){
		System.out.println("no arg constructors");
		emid=101;
		ename="mahesh";
		sal=10000;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.sal=101;
		e1.ename="mahi";
		e1.sal=11111;
;
		e1.emp();
		Employee e2=new Employee();
		e2.emp();
		// TODO Auto-generated method stub

	}
	void emp() {
		System.out.println(emid);
		System.out.println(ename);
		System.out.println(sal);
	}

}
