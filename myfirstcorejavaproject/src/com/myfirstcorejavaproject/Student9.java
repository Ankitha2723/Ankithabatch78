package com.myfirstcorejavaproject;

public class Student9 {
	int sum(int a,int b) {
		return a+b;
		
	}
	double avg(int a,int b) {
		return (a+b)/2;
	}
	String name() {
		return("ankitha");
	}



	

	public static void main(String[] args) {
		Student9 s1=new Student9();
		int sum=s1.sum(40, 23);
		double avg=s1.avg(24, 60);
		String name=s1.name();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(name);
		
	}

}
