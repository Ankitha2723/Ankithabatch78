package com.myfirstcorejavaproject.arrays.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elemnet size");
		int n = sc.nextInt();
		int[] array = new int[n];
		int temp = 0;
		System.out.println("enter elements");
		for (int i = 0; i < n ; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n-1 ; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(array));

		// TODO Auto-generated method stub

	}

}
