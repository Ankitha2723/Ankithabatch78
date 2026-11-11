package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array length");
		int n=sc.nextInt();
		int positive=0;
		int negative=0;
		int[] arr=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				{
					positive++;
				}
			}else {
				{
					negative++;
				}
			}
		}
		System.out.println("positive numbers count is :"+positive);
		System.out.println("nehgative numbers count is :"+negative) ;
		// TODO Auto-generated method stub

	}

}
