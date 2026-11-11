package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

//fibonocci series 
//intput is 10
//0 1 1 2 3 5 8 13 21

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1 + " " + n2);
		for(int i=1;i<=n;i++) {
			int n3=n1 +  n2;
			System.out.print( " " + n3);
			n1=n2;
			n2=n3;
			
		}
		// TODO Auto-generated method stub

	}

}
