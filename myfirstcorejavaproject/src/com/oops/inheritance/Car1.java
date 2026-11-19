package com.oops.inheritance;

import java.util.Scanner;

class Vehicle2{
	
	String brand;
	int speed;
	void start() {
		
		System.out.println("brand :"+brand);
		
		System.out.println("speed :"+speed);
		
		System.out.println("vechile is start");
	}
	void stop() {
		System.out.println("vechile is stop");
	}
}

public class Car1 extends Vehicle2 {
	
	
	String fuel_type;
	
	void drive() {
		System.out.println("fueltype:"+fuel_type);
		System.out.println("car is driving");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Car1 c1=new Car1();

        System.out.println("Enter brand:");
        c1.brand = sc.nextLine();

        System.out.println("Enter speed:");
        c1.speed = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter fuel type:");
        c1.fuel_type = sc.nextLine();

		c1.start();
		c1.stop();
		c1.drive();
		
		// TODO Auto-generated method stub

	}

}
