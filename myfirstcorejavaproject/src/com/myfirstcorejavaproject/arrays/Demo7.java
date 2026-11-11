package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a lenth");
		int length=sc.nextInt();
		int [] num=new int[length];
		System.out.println("enter a elements");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(num));
		// TODO Auto-generated method stub

	}

}
