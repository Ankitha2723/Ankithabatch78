package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("entar the length of array");
		int size=sc.nextInt();
		int [] num=new int[size];
		int sumofeven=0;
		int sumofodd=0;
		System.out.println("enter a elements");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			if(num[i]%2==0) {
				sumofeven=sumofeven+num[i];
			}else {
				sumofodd=sumofodd+num[i];
			}
			
		}
		System.out.println("evennumbers :"+ sumofeven);
		System.out.println("odd numbers:"+ sumofodd);
		
		// TODO Auto-generated method stub

	}

}
