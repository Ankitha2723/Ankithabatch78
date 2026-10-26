package com.myfirstcorejavaproject;
class Parent{
	//int x=10;
	void show() {
		System.out.println("parent");
	}
}

public class Child extends Parent{
	//int x=20;
	@Override
	void show() {
		System.out.println("child");
		
	}

	public static void main(String[] args) {
		Parent obj=new Child();
		//System.out.println(obj.x);
		obj.show();
		// TODO Auto-generated method stub

	}

}
