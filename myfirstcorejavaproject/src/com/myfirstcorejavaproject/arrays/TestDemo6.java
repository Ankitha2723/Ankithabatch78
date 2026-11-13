package com.myfirstcorejavaproject.arrays;
//wap to find aoccurance of given elenments

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		int[] numbers= {10,20,3,4,4,4,5,6,7,7,8,9};
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a element");
		int element=sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(element==numbers[i]) {
				count++;
			}
		}
		System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}
