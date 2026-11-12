package com.myfirstcorejavaproject.arrays;

public class Demo9 {

	public static void main(String[] args) {
		//int r=0;
		
		int[] array= {11,12,13,14,15,16};
		
		
		for(int i=0;i<array.length;i++) {
			int n=array[i];
			
			int rev=0;
			while(n>0) {
				int r=n%10;
				n=n/10;
				rev=rev*10+r;
			}
			
			
			System.out.println(rev);
				
				
				
			}
		
			
		}
		// TODO Auto-generated method stub

	}


