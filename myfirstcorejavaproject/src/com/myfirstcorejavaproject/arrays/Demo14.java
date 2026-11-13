package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		//anner sc=new(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length if string");
		int n=sc.nextInt();
		String[] names=new String[n];
		System.out.println("enter a names");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		for(int i=0;i<names.length;i++) {
			if(names[i].toLowerCase().startsWith("m")&&names[i].endsWith("i")) {
			System.out.println(names[i]);
			
		}
		
		// TODO Auto-generated method stub

	}

}
}
