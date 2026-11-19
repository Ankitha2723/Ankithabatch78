package com.myfirstcorejavaproject.arrays;

import java.util.Arrays;

public class TestDemo12 {

	public static void main(String[] args) {
		int arr[]= {99,95,71,84,81,75,60};
		int rem=0;
		
		for (int i=0;i<arr.length;i++) {
			{
				rem=arr[i]%10;
				if(rem>5)
				{
					arr[i]=arr[i]+(10-rem);
				}
				else {
					arr[i]=arr[i]-rem;
				}
			}
				
					
		}
		

		System.out.println(Arrays.toString(arr));
			
		}
		
		
		
		
		

	}


