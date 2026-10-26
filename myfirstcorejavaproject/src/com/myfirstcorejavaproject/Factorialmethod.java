package com.myfirstcorejavaproject;

class Student {
	String name;
	int id;

}
class Emp{
	String name;
	int id;
	String loc;
	
}

public class Factorialmethod {

	public static Student getStudentinfo() {
		Student s = new Student();
		s.name = "ankitha";
		s.id = 1000201;
		return s;
	}

	static Emp getempinfo() {
		Emp e1=new Emp();
		e1.name="ankitha vanga";
		e1.id=122323;
		e1.loc="hyd";
		return e1;
	}
	public static void main(String[] args) {
		Student s = getStudentinfo();
		System.out.println(s.name);
		System.out.println(s.id);
		Emp e1=getempinfo();
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.loc);
	}

}
