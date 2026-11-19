package com.myfirstcorejavaproject.arrays.sorting;

import java.util.Arrays;
//desending order

public class TestBubblesort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 2, 1 };
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j ];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}
		System.out.println("afret sorting array:");
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}
