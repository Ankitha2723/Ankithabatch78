package com.myfirstcorejavaproject.arrays.selectionsor;
//find 3 rd smallest element
import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		int[] arr = {9, 4, 7, 2, 6, 1};
		int temp;
	//	int i;
		for (int i=0;i<arr.length-1;i++) {
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
		System.out.println(arr[2]);
		// TODO Auto-generated method stub

	}

}
