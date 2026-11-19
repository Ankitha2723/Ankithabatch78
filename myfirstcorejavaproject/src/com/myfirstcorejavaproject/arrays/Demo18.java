package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

//WAp to print sum and avg

public class Demo18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] array=new int[n];
		int sum=0;
		double avg=0;
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			sum=sum+array[i];
			avg=sum/n;
		}
		System.out.println(sum);
		System.out.println(avg);
		// TODO Auto-generated method stub

	}

}
