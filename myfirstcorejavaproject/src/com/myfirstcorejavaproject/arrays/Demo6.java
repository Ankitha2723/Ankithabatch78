package com.myfirstcorejavaproject.arrays;

public class Demo6 {

	public static void main(String[] args) {
		int [] marks= {1,3,5,7,8,9,1,3,4};
		int min=marks[0];
		int max=marks[0];
		for(int m:marks) {
			if(m<min) {
				min=m;
			}else if(m>max) {
				max=m;
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}
