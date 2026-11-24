package com.oops.inheritance;

public class Laptop extends Device1 {
	 private String ram;
	 private String processor;
	 public void setram(String ram) {
		 this.ram=ram;
	 }
	 public void setprocessor(String processor) {
		 this.processor=processor;
		 
	 }
	 public void runIde() {
		 System.out.println("running ide on laptop");
	 }
	 public void compilecode() {
		 System.out.println("compile code on laptop");
	 }
	 @Override
	 public void display() {
		 System.out.println("laptop details");
		 super.display();
		 System.out.println("ram :" + ram);
		 System.out.println("processor :"+processor);
		 
		 
	 }
	

}
