package com.oops.inheritance;

class Vechile {
	String name;
	int speed;

	public Vechile(String name, int speed) {
		this.name = name;
		this.speed = speed;

	}

	void start() {
		System.out.println(name + "is strating");
	}

	void stop() {
		System.out.println(name + "is stopping");
	}

	void display() {
		System.out.println("name :" + name);
		System.out.println("speed :" + speed);
	}

}

class Car extends Vechile {

	public Car(String name, int speed) {
		super(name, speed);
	}

	void sunroof() {
		System.out.println("car can open sunroof");

		// TODO Auto-generated constructor stub
	}
}

class Bike extends Vechile {

	public Bike(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}

	void doWeelie() {
		System.out.println("Bile is doing weelie");
	}

}

class Truck extends Vechile {

	public Truck(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}

	void loadCargo() {
		System.out.println("truck is doing load Cargo");
	}

}

public class TestVechile {
	public static void main(String[] args) {
		Car c1 = new Car("toyato", 250);
		c1.start();
		c1.stop();
		c1.display();
		c1.sunroof();
		System.out.println();

		Bike b1 = new Bike("honda", 99);
		b1.start();
		b1.stop();
		b1.display();
		b1.doWeelie();
		System.out.println();

		Truck t1 = new Truck("Tata", 80);
		t1.start();
		t1.stop();
		t1.display();
		t1.loadCargo();
		System.out.println();

	}
}
