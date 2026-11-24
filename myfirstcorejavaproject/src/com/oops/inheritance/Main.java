package com.oops.inheritance;
class Vechile13{
	String name;
	int speed;
	public Vechile13(String name,int speed) {
		this.name=name;
		this.speed=speed;
	}
		
	public void stop() {
		System.out.println(name + "can stop");
	}
	public void start() {
		System.out.println(name + "can start");
	}
}
class Car4 extends Vechile13{
	public Car4(String name,int speed) {
		super(name,speed);
		
	}
	public void sunRoof() {
		System.out.println("open sunroof");
	}
	
}
class Bike4 extends Vechile13{

	public Bike4(String name, int speed) {
		super(name, speed);
		// TODO Auto-generated constructor stub
	}
	public void doWheele(){
		System.out.println("bike can do while");
		
	}
}

public class Main {

	public static void main(String[] args) {
		Car4 c1=new Car4("toyato",40);
		c1.start();
		c1.stop();
		c1.sunRoof();
		Bike4 b1=new Bike4("hero-honda",40);
		b1.stop();
		b1.start();
		b1.doWheele();
		// TODO Auto-generated method stub

	}

}
