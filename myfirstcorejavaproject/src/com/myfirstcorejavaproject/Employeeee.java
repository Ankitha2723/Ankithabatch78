package com.myfirstcorejavaproject;

public class Employeeee {
	int id;
	String name;
	int sal;
	Employeeee(Employeeee e1){
		this.id=e1.id;
		this.name=e1.name;
		this.sal=e1.sal;
	}
	Employeeee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	public static void main(String[] args) {
Employeeee e1=new Employeeee(101,"mahi",20000);
e1.display();
Employeeee e2=new Employeeee(e1);
e2.display();
	}
	void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("sal:"+sal);
		
	}

}
