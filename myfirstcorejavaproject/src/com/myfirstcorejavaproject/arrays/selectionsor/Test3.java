package com.myfirstcorejavaproject.arrays.selectionsor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {
	//second highest number

	public static void main(String[] args) {
		int[] arr = {7, 3, 9, 1, 5};
		int temp;
		int i;
		for(i=0;i<2;i++) {
			int max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[max]) {
					max=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
		}
		System.out.println(arr[1]);
		// TODO Auto-generated method stub

	}

}
