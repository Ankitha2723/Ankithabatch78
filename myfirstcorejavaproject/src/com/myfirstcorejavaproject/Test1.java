package com.myfirstcorejavaproject;
// Static Block vs instance Block
public class Test1 {
//static	Test1 t1 = new Test1();
	static {
		System.out.println("static block called");
	//	Test1 t1 = new Test1();
	}
	 static Test1 t1 = new Test1();
	//instance block
	{
		
		System.out.println("instance block called");
		//Test1 t1 = new Test1(); this block not executed
		
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
	
		System.out.println("main method ended");
		{
			
			System.out.println("instance block called");
			//Test1 t1 = new Test1(); this block not executed
			
		}
	}
	 
	}


