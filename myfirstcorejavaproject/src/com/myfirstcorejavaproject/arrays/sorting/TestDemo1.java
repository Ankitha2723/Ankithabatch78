package com.myfirstcorejavaproject.arrays.sorting;

import java.util.Arrays;

//WAp in desending order by using bubble sort

public class TestDemo1 {

	public static void main(String[] args) {
		int arr[] = {10, 40, 20, 5, 30};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		// TODO Auto-generated method stub

	}
		System.out.print(Arrays.toString(arr));

	}
}
