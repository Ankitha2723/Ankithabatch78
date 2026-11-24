package com.oops.inheritance;

abstract class Foodorder {
	abstract void calculateBill();
	abstract void prepareorder();

}
class PizzaOrder extends Foodorder{
	double price=250;
	int quantity=2;
	@Override
	void calculateBill () {
		System.out.println("pizza Bill:Rs."+price * quantity);
		
	}
	@Override
	void prepareorder() {
		System.out.println("preparing pizaaa");
	}
		
	
}
class BurgerOrder extends Foodorder{
	double price=250;
	int quantity=3;


	@Override
	void calculateBill() {
		System.out.println("Burger Bill:Rs."+price * quantity);
		
	}
		// TODO Auto-generated method stub
		
	

	@Override
	void prepareorder() {
		System.out.println("preparing Burger");
	}
		// TODO Auto-generated method stub
		
	}
class Biryani extends Foodorder{
	double price=200;
	int quantity=3;


@Override
void calculateBill() {
	System.out.println("biryaani Bill:Rs."+price * quantity);
	// TODO Auto-generated method stub
	
}

@Override
void prepareorder() {
	// TODO Auto-generated method stub
	System.out.println("preparing Biryaani");
	
}
}
public class Device{
	public static void main(String [] args) {
		Foodorder f1=new PizzaOrder();
		Foodorder f2=new BurgerOrder();
		Foodorder f3=new Biryani();
		
		f1.calculateBill();
		f1.prepareorder();
		System.out.println();
		f2.calculateBill();
		f2.prepareorder();
		System.out.println();
		f3.calculateBill();
		f3.prepareorder();
		
		
		
	}
}

