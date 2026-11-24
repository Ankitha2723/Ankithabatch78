package com.myfirstcorejavaproject.arrays;

public class TestDemo16 {
	//find a fequent count

	public static void main(String[] args) {
		int arra[]= {1,2,1,3,1,2,3,4,5,6,1,4,2};
		boolean visited[]=new boolean[arra.length];
		for(int i=0;i<arra.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arra.length;j++) {
				if(arra[i]==arra[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(arra[i]+"->"+count);
		}
		
		// TODO Auto-generated method stub

	}

}
