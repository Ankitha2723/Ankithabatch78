package com.myfirstcorejavaproject.arrays;

public class TestDemo19 {

	public static void main(String[] args) {
		int[] array= {1,2,3,1,2,3,4,5,6,1,4,2};
		for (int i=0;i<array.length;i++) {
			if(array[i]==-1) {
				continue;
			}
		
		int count=1;
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]) {
				array[j]=-1;
				count++;
			}
		}
			
		
		System.out.println(array[i] +"->" + count);
		// TODO Auto-generated method stub
		}
	}

}
