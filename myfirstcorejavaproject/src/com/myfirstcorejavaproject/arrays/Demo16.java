package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;
//wap program to find smallest and largest number

public class Demo16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
        int n = sc.nextInt();

		int [] array=new int[n];
		
		System.out.println("enter array elemnets");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			
		}
		int smallest=array[0];
		int highhest=array[0];
		for(int j=1;j<n;j++) {
			if(array[j]<smallest) {
				smallest=array[j];
				
				
			}
			if(array[j]>highhest) {
				highhest=array[j];
				
			}
		}
		System.out.println("smallest element:"+smallest);
		System.out.println("highest element is:"+ highhest);
		
		// TODO Auto-generated method stub

	}

}
