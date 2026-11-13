package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		int[] array= {4,5,7,1,3};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a k element");
		int k=sc.nextInt();
		int count=0;
		
		for(int i=0;i<k;i++) {
			count=0;
			for(int j=0;j<array.length;j++) {
				if(array[i]<array[j]) {
					count++;
				}
			}
			if(count==k-1) {
				System.out.println(array[i]);
				break;
			}
			
			
		}
		// TODO Auto-generated method stub

	}

}
