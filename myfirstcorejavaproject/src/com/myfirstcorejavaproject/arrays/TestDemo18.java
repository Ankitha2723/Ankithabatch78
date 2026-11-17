package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;

public class TestDemo18 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 5, 0, 3, 0, 4, 0 };
		int index = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] != 0) {
				array[index]=array[i];
				index++;

			} 
			}
		while(index<array.length) {
			array[index]=0;
			index++;
			// TODO Auto-generated method stub
		}
		System.out.println(Arrays.toString(array));

	}

}
