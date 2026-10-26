package com.myfirstcorejavaproject;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=60) {
			System.out.println("old age");
		}else if(age>=36) {
			System.out.println("middle age");
		}else if(age>=20) {
			System.out.println("young age");
		}else if(age>=12) {
			System.out.println("teen age");
		}else if(age>=6) {
			System.out.println("child");
		}else {
			System.out.println("kid");
		}
		// TODO Auto-generated method stub

	}

}
