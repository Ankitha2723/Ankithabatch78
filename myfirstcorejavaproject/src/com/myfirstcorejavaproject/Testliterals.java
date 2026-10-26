package com.myfirstcorejavaproject;

public class Testliterals {

	public static void main(String[] args) {
		//String literals
String s="srikanth";
System.out.println(s);
//String object
String s2=new String("java");
System.out.println(s2);
//null literal
String s3=null;
System.out.println(s3);
//boolean literals
boolean status=true;
if(status) {
	System.out.println("good morning");
	
}else {
	System.out.println("bad morning");
}
char c1='A';
char c2=99;
char c3='\u0040';
char c4='\uabcd';
System.out.println(c1);
System.out.println(c2);
System.out.println(c3);
System.out.println(c4);

	}

}
