package com.myfirstcorejavaproject;

public class Employeee {
	String name;
	int id;
	double salary;
	Employeee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	public static void main(String[] args) {
        Employeee e1=new Employeee("ankitha",20,30000);
        Employeee e2=new Employeee("anki",30,40000);

        e1.emp();
        System.out.println("emp details2");
        e2.emp();
        
	}
	void emp() {
		System.out.println("ename:"+name);
		System.out.println("id:"+id);
		System.out.println("salary:"+salary);
	}

}
