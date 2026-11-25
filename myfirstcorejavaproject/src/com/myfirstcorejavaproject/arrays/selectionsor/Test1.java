package com.myfirstcorejavaproject.arrays.selectionsor;

import java.util.Arrays;

public class Test1 {
	//sort in assending order

	public static void main(String[] args) {
		int[] arr = {9, 5, 2, 7, 1};
		int temp;
		int i;
		for(i=0;i<arr.length-1;i++) {
		int maxindex=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]>arr[maxindex]) {
				maxindex=j;
				
			}
		}
		temp=arr[i];
		arr[i]=arr[maxindex];
		arr[maxindex]=temp;
		// TODO Auto-generated method stub

	}
		System.out.println(Arrays.toString(arr));
	}

}
