package com.myfirstcorejavaproject;

public class Test5 {
	byte b;
	//byte= 8 bits
	// by default RHS numeric values are int.
	// if you want to convert int to byte we use (byte)
	// -127 -126 -125 -124 .........0 .............125 126 127
	byte b1=(byte)130;//-126// converting int to byte
	
	// short=16 bits ....2^15
	//-32767 to 32767
	short s=(short)32769;//explicit type casting
	short s1=b1;
	
	//int=4 bytes=32 bits.....
	//-2147483648  to 2147483648
	int i=2147483647;
	int i1=(int)2147483648L;
	long l;
	float f;
	double d;
	char c;
	boolean boo;
	
	

	public static void main(String[] args) {
		Test5 t1=new Test5();
		System.out.println("byte:"+ t1. b);//
		System.out.println("byte:"+ t1. b1);
	
		System.out.println("short:"+ t1.s);//0
		System.out.println("short1:"+ t1.s1);//0

		System.out.println("int:"+ t1.i);//0
		System.out.println("int:"+ t1.i1);//0

		System.out.println("long:"+ t1.l);//0
		System.out.println("float:"+ t1.f);//0.0
		System.out.println("double:"+ t1.d);//0.0
		System.out.println("char:"+ t1.c);
		System.out.println("boolean:"+ t1.boo);//false






		
		
		
		// TODO Auto-generated method stub

	}

}
