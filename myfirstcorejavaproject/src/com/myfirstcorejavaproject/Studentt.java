package com.myfirstcorejavaproject;

public class Studentt {
	String name;
	int age;
	Studentt(Studentt s1){
		this.name=s1.name;
		this.age=s1.age;
	}
	Studentt(String name,int age){
		this.name=name;
		this.age=age;
	}


	public static void main(String[] args) {
         Studentt s1=new Studentt("ankitha",20);
         s1.display();
         Studentt s2=new Studentt(s1);
         s2.display();

         
	}
	void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

}
