package com.myfirstcorejavaproject;
//return type + no parameters
public class Method6 {
	static int getnumber() {
	//int result=getnumber();
	//System.out.println(result);
		return (100);
	}
	static int addition() {
		int a=10;
		int b=20;
	 return(a + b);
	}
	static int subtraction() {
		int a=10;
		int b=20;
		return(a - b);
	}
	static int cube() {
		int n=3;
		return(n * n * n);
	}
	static double area() {
		int r=5;
		return(Math.PI * r * r);
	}
	static String details() {
		
	
		return ("ankitha");
	}

	public static void main(String[] args) {
int result=getnumber();
System.out.println(result);
 result=addition();
 System.out.println(result);
 int result2=subtraction();
 System.out.println(result);
int result1=cube();
 System.out.println(result1);
 double area=area();
 System.out.println(area);
 String String=details();
 System.out.println(String);
		//getnumber();
}

}
