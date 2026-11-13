package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;

public class Demo15 {
	//to print two data element into one data element

	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int[]b= {1,2,3,4,5};
		int[]c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(c));
		
		// TODO Auto-generated method stub

	}

}
