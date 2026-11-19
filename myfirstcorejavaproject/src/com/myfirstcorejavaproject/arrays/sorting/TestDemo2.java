package com.myfirstcorejavaproject.arrays.sorting;

import java.util.Arrays;

public class TestDemo2 {

	public static void main(String[] args) {
		// TODO A
int count=0;
		int arr[] = {4, 2, 4, 1, 2};
		int temp=0;
		
		for(int i=0;i<arr.length-1;i++) {
			count++;
			
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
			
		// TODO Auto-generated method stub

	}
		System.out.println(count);
		System.out.print(Arrays.toString(arr));

	}
}

