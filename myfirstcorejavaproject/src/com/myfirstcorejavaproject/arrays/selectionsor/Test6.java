package com.myfirstcorejavaproject.arrays.selectionsor;

public class Test6 {
	//find the smallest element and largest element

	public static void main(String[] args) {
		
				int[] arr = {12, 5, 8, 2, 20, 4};
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
				System.out.println(arr[0]);
				System.out.println(arr[arr.length-1]);
				// TODO Auto-generated method stub

			}

		}

		// TODO Auto-generated method stub

	


