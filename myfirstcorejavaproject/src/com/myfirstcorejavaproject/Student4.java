package com.myfirstcorejavaproject;

public class Student4 {
	String name;
	int age;
	
Student4(){
	this("unknown");
	
}
Student4(String name){
	this(name,20);
	
	
}
Student4(String name,int age){
	this.age=age;
	this.name=name;
}
	

	public static void main(String[] args) {
Student4 s1=new Student4();
s1.stud();
Student4 s2=new Student4("rahul",22);
s2.stud();


	}
	void stud() {
		System.out.println(name);
		System.out.println(age);
	}

}
