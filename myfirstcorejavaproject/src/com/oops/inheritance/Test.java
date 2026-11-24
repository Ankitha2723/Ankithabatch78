package com.oops.inheritance;
class Vechile5{
	int speed=50;
	void display() {
		System.out.println("vechikle spee is:"+ speed);
	}
}
class Car7 extends Vechile5{
	int speed=20;
	@Override
	void display() {
		System.out.println("car speed is:"+ speed);
		
	}
}

public class Test {

	public static void main(String[] args) {
		Vechile5 v1=new Car7();
		v1.display();
		System.out.println("spee is:" + v1.speed);
		// TODO Auto-generated method stub

	}

}
