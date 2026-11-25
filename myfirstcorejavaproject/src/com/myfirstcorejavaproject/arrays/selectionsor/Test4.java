package com.myfirstcorejavaproject.arrays.selectionsor;

import java.util.Arrays;

public class Test4 {
	//remove duplicate data

	public static void main(String[] args) {
		int[] arr = {5, 2, 5, 1, 3, 2};
		int temp;
		int i;	
		for(i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					
				}
				
				
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		 int count = 1;

	        for ( i = 1; i < arr.length; i++) {

	            if (arr[i] != arr[i - 1]) {
	                arr[count] = arr[i];
	                count++;
	            }
	        }

	        // Step 3: Print unique elements
	        System.out.println(Arrays.toString(Arrays.copyOf(arr, count)));
		// TODO Auto-generated method stub

	}

}
