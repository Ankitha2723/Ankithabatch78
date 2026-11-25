package com.myfirstcorejavaproject.arrays.selectionsor;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		//duplicate array
		
		int[] arr = {5, 2, 5, 1, 3, 2};
				int temp;
				int i;
				for(i=0;i<arr.length-1;i++) {
				int maxindex=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[maxindex]) {
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

		

		// TODO Auto-generated method stub

	


