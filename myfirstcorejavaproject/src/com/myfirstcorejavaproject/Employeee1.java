package com.myfirstcorejavaproject;

public class Employeee1 {
	int id;
	String name;
	double salary;
	Employeee1(int i,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
	}
	double calculate() {
		return salary*0.10;
	}
	void display() {
		double bonus=calculate();
		double totalsal=salary+bonus;
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee salary"+salary);
		System.out.println("Employee bonus:"+bonus);
		System.out.println("employe finalsal:"+totalsal);
		
				
	}

	public static void main(String[] args) {
		Employeee1 e=new Employeee1(20,"Ankitha",200000);
		e.display();
	
		// TODO Auto-generated method stub

	}

}
