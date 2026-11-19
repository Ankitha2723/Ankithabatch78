package com.oops.inheritance;

import java.util.Scanner;

class Person{
	int age;
	String name;
	void diplayPersonInfo() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	}
}

public class Student extends Person{
	int rollnum;
	String course;
void displayStudentDetails() {
	System.out.println("rollnum:"+rollnum);
	System.out.println("course:"+course);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("enter your name");
		s1.name=sc.next();
		System.out.println("enter your age");
		s1.age=sc.nextInt();
		System.out.println("enter your roll number");
		s1.rollnum=sc.nextInt();
		System.out.println("enter your course");
		s1.course=sc.next();
		s1.diplayPersonInfo();
		s1.displayStudentDetails();
		// TODO Auto-generated method stub

	}

}
