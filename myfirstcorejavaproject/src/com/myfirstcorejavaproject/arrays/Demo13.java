package com.myfirstcorejavaproject.arrays;

public class Demo13 {

	public static void main(String[] args) {
		int[] num= {7,5,8,26,26,13};
		int min=num[0];
		int highest=min;
		int second_highest=min;
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				second_highest=highest;
				highest=num[i];
			}else if(num[i]>second_highest && num[i]!=highest) {
				second_highest=num[i];
			}
			
		}
		System.out.println(second_highest);
		// TODO Auto-generated method stub

	}

}
