package com.oops.inheritance;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int[] array= {9,6,5,7,5,4,3,2,3};
		int temp=0;
		for(int i=0;i<array.length-1;i++) {
			int minindex=i;
			for(int j=i+1;j<array.length-1;j++) {
				if(array[j]<array[minindex]) {
				minindex=j;
			}
		}
		temp=array[i];
		array[i]=array[minindex];
		array[minindex]=temp;
		
		// TODO Auto-generated method stub

	}
		System.out.println(Arrays.toString(array));

}
}
