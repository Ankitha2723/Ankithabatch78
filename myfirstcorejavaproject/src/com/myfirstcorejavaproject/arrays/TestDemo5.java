package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int n=sc.nextInt();
		int [] number=new int[n];
		int nonzero=0;
		int zero=0;
		System.out.println("enter  aeklements");
		for(int i=0;i<number.length;i++) {
		number[i]=sc.nextInt();
		if(number[i]!=0){
			{
				nonzero++;
				
			}
		}else if(number[i]==0){
				{
					zero++;
				}
			}
		}
		System.out.println(nonzero);
		System.out.println(zero);
		}
		// TODO Auto-generated method stub

	}



