package com.myfirstcorejavaproject;

public class Method {

	public static void main(String[] args) {
		System.out.println("main method started");
		
	     getAge(20);
	     getFullname("Ankitha","vanga");
	     getScore(50,30,50,90,99,85);
	     getWeight(62.3f);
	     getheight(5.3);
	     fatherName("Srinu");
	     mothername("Malathi");
	     Village("Ammapalem");
	     Mandal("dornakal");
	     getGeninfo("F");
	     Favcol("pink");
	     Favfood("Biryaani");

	}
	static void getAge(int age) {
		System.out.println("person age is:"  +age);
	}
	static void getFullname(String fname,String laname) {
		System.out.println("person first name:"+fname+" "+laname);
	}
	static void getScore(int t,int m,int so,int s,int h,int e) {
		int sum=t+m+so+s+h+e;
		System.out.println("sum:"+sum);
		float avg=sum/6;
		System.out.println("avg of marks:"+avg);
	}
	static void getWeight(float w) {
		System.out.println("weight:"+w)	;
		}
	static void getheight(double h) {
		System.out.println("height:"+h);
	}
	static void fatherName(String f) {
		System.out.println("fathername:"+f);
		
	}
	static void mothername(String m) {
		System.out.println("mothername:"+m);
	}
	static void Village(String v) {
		System.out.println("village:"+v);
	}
	static void Mandal(String M) {
		System.out.println("mandal:"+M);
	}
	static void getGeninfo(String string) {
		System.out.println("Gender:"+string);
	}
	static void Favcol(String a) {
		System.out.println("Favcol:"+a);
	}
	static void Favfood(String b) {
		System.out.println("Favfood:"+b);
	
	}
	

}
