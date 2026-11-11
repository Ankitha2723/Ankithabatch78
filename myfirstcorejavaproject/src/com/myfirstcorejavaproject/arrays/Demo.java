package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] array= {1,0,2,0,0,9,1,0,7,0};
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				array[index]=array[i];
				index++;
			}
		
			
		}
		while(index<array.length) {
			array[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(array));
		// TODO Auto-generated method stub

	}

}
