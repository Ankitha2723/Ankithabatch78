package com.myfirstcorejavaproject;

public class Methods {
	static {
		System.out.println("welcome sattic block");
	}
	{
		System.out.println("instance block");
	}
	{
		System.out.println("instance block2");
	
	}
	{
		System.out.println("instance block");
	}
	public static void main( String [] args) {
		Methods a1=new Methods();
	
		Methods a2=new Methods();
	
		
	}

}
