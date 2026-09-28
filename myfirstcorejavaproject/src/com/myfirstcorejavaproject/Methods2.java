package com.myfirstcorejavaproject;
import java.util.Scanner;

public class Methods2 {

void main() {
        System.out.println("main method started");
     Scanner sc =new Scanner(System.in);
     System.out.println("******************Area of Traingale**************");
     System.out.println("Enter Base:");
     float Base=sc.nextFloat();
     System.out.println("ENter height");
     double height=sc.nextDouble();
     double arewaTRi=findAreaofTraingle(Base,height);
     System.out.println("area of the traingle:"+arewaTRi);
     System.out.println("******************* area squer****************");
     System.out.println("ente side");
     double side=sc.nextDouble(); 
    double ars=findAreas(side);
    System.out.println("area of side:"+ars);
    System.out.println("******************** are of circle**************");
    System.out.println("enter radious");
    double radius=sc.nextDouble();
    double areacir=findareaofcircle(radius);
    System.out.println("area of circle:"+areacir);
    System.out.println("***********area of rectangle*************");
    System.out.println("enter base");
    float base=sc.nextFloat();
    System.out.println("enter height");
    float height1=sc.nextFloat();
    double arerect=findareaofrect(base,height1);
    System.out.println("area of reactangle:"+arerect);
    
    
    
	}
static double findAreaofTraingle(float Base,double height) {
	 double arrtra=0.5 * Base * height;
	return arrtra;
	
}
static  double findAreas(double side) {
	 double area=(side * side);
	 return area;
}
static double findareaofcircle(double radious) {
	
	 double circle=Math.PI * radious *radious;
	 return circle;
}
static double findareaofrect(float base,float height) {
	double rect=0.5 * base * height;
	return rect;
	
}
	
}


