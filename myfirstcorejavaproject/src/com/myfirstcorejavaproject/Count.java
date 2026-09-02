package com.myfirstcorejavaproject;

public class Count {
	static int count;
	Count(){
		count++;
	}

	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		Count c4=new Count();
		Count c5=new Count();
		Count c=new Count();
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
