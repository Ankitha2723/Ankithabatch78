package com.myfirstcorejavaproject;
class Vecle{
	String type;
	Vecle(String type){
		this.type=type;
	}
}
//class Car8 extends Vecle{
//	String brand;
//	int price;
//	Car8(String type,String brand,int price){
//		this.brand=brand;
//		this.price=price;
//		super(type);
//		
//	}
//}



public class Electricvehicle extends Car8 {
	int baterytype;

	
	Electricvehicle(String type,String brand,int price,int baterytype){
	this.baterytype=baterytype;
	//super(type,brand,price);
	}

	public static void main(String[] args) {
		Electricvehicle e1=new Electricvehicle("cavoe","tata",30000000,30);
		e1.display();
		
		// TODO Auto-generated method stub

	}
	void display() {
//		System.out.println("type:"+type);
//		System.out.println("brand"+brand);
//		System.out.println("price"+price);
//		System.out.println("baterytype"+baterytype);
	}

}
