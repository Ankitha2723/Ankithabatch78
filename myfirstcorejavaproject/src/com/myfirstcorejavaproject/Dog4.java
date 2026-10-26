package com.myfirstcorejavaproject;

public class Dog4 {
String breed;
int age;
Dog4(Dog4 d1){
	 this.breed=d1.breed;
	   this.age=d1.age;
	
}
   Dog4(String breed,int age){
	   this.breed=breed;
	   this.age=age;
	
}

	public static void main(String[] args) {
          Dog4 d1=new Dog4("xyz",4);
          d1.doginfo();
          Dog4 d2=new Dog4(d1);
d2.doginfo();
	}
void doginfo() {
	System.out.println("breed:"+breed);
	System.out.println("age:"+age);
}
}
