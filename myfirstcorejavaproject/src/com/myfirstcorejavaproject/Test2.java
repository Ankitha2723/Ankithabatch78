package com.myfirstcorejavaproject;

public class Test2 { 
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized method called");
		
	}
	void hello() {
		System.out.println("good morning");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		//nullifying the object
		t1=null;
		t2=null;
		System.gc();
		//Re-assigning the object
		
		Test2 t4=new Test2();
		System.out.println(t4);
		System.gc();
		//Anonymous
		new Test2().hello();
		//out of scop
		{
			Test2 t5=new Test2();
			System.out.println("have a nice day");
			System.out.println(t5);
			
		}
		
		// TODO Auto-generated method stub

	}

}
