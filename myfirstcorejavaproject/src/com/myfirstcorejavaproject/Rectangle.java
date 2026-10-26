package com.myfirstcorejavaproject;

public class Rectangle {
	
	int length;
	int breadth;
	Rectangle(){
		this(1,1);
		
	}
	Rectangle(int side){
		this(side,side);
	}
	Rectangle(int breadth,int length){
		
		this.length=length;
		this.breadth=breadth;
	}
 void area() {
	 System.out.println("area:"+ length * breadth);
 }


	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.area();
		Rectangle r2=new Rectangle(20);
		r2.area();
		Rectangle r3=new Rectangle(10,20);
		r3.area();
		// TODO Auto-generated method stub

	}

}
