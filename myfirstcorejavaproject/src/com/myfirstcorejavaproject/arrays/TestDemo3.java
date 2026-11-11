package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  length number");
		int n=sc.nextInt();
		int [] array= new int[n];
		int odd=0;
		int even=0;
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			 array[i]=sc.nextInt();
			if(array[i]%2==0) {
				{
					even++;
				}
				
			}else {
				{
					odd++;
				}
				
			}
		}
		System.out.println("even number is : " +even);
		System.out.println("odd number is:" +odd);
		
		
		// TODO Auto-generated method stub

	}

}
