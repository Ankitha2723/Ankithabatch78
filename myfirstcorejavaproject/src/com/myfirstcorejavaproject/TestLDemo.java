package com.myfirstcorejavaproject;

public class TestLDemo {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=1;
		String  max1=(a>b)
				?(a>c)?"a is max":" c is max"
						:(b>c)?"b is max":"c is max";
		System.out.println( max1);
		// TODO Auto-generated method stub

	}

}