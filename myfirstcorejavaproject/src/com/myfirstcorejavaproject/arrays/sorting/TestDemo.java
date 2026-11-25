package com.myfirstcorejavaproject.arrays.sorting;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
	
		int [] array= {4,6,2,8,5,1};
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
					
				}
				
			}
			
			
		}
		
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
