package com.myfirstcorejavaproject;

public class Area {
int length;
int width;
Area(Area a1){
	this.width=a1.width;
	this.length=a1.length;
}
Area(int length,int width){
	this.length=length;
	this.width=width;
	
}
	public static void main(String[] args) {
     Area a1=new Area(20,30);
     a1.display();
     Area a2=new Area(a1);
     a2.display();
	}
	void display() {
		System.out.println("lenghth:"+length);
		System.out.println("width:"+width);
		System.out.println("total:"+(width*length));

		

		
	}

}
