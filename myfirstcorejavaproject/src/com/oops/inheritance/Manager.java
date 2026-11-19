package com.oops.inheritance;
class Employee11{
	String name;
	double salary;
	int id=2;
	void display() {
		System.out.println("Employee name :"+name);
		System.out.println("Employee salary:"+salary);
		System.out.println("Employee id :"+id);
		
		System.out.println("main methpod startted from employere class");
	}
}

public class Manager extends Employee11{
	String depart="CSE";
	void displayManager() {
		System.out.println("department:"+depart);
		System.out.println("main method startde from manager");
	}
	

	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.display();
		m1.displayManager();
		
		// TODO Auto-generated method stub

	}

}
