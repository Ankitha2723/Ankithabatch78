package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;

public class Demo11 {

	public static void main(String[] args) {
		int[] array= {10,20,30,40,50,60};
		int num=0;
		int[]b=new int[array.length];
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				num=array[i]+array[i+1];
				b[i]=num;
				
			}else if(i==array.length-1) {
				num=array[i]+array[i-1];
				b[i]=num;
			}else {
				num=array[i+1]+array[i-1];
				b[i]=num;
			}
			//System.out.println(Arrays.toString(b));
			
			
		}
		System.out.println(Arrays.toString(b));
		
		// TODO Auto-generated method stub

	}

}
