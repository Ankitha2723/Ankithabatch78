package com.oops.inheritance;

public class TestDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Laptop l=new Laptop();
		l.setbrand("hp");
		l.setprice(50000);
		l.setram("15");
		l.setprocessor("intel i5");
		Device1 d=new Laptop();
		
		d.display();

	}

}
