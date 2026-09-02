package com.myfirstcorejavaproject;

public class Test4 {
	static String collegename;
	 static int clgid;
	String stname;
	String surname;

	public static void main(String[] args) {
		System.out.println("main method started");
		Test4 st1=new Test4();
		collegename="vaagdevi";
		clgid=12;
		st1.stname="ankitha";
		st1.surname="vanga";
		System.out.println("collegename:" + collegename);
		System.out.println("clgid:"+clgid);
		System.out.println(st1.stname);
		System.out.println(st1.surname);
		// TODO Auto-generated method stub

	}

}
