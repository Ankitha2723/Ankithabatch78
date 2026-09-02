package com.myfirstcorejavaproject;

public class student {
	static String collegename;
	static int collegeid;
	int studentid;
	String studentname;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method started");
collegename="vaagdevi ";
collegeid=22;
System.out.println("object1 info ***********");
student st1=new student();
st1.studentid=12;
st1.studentname="ankitha";
System.out.println(st1.studentid);
System.out.println(st1.studentname);
System.out.println(collegename);
System.out.println(collegeid);
System.out.println("main method ended");
	}

}
