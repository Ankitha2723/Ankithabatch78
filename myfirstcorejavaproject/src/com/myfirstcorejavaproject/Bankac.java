package com.myfirstcorejavaproject;
import java.util.Scanner;


public class Bankac {
	int acnum;
	String Acname;
	double balance;
	String Branch;
	Bankac(int acnum,String Acname,double balance,String Branch){
		this.acnum=acnum;
		this.Acname=Acname;
		this.balance=balance;
		this.Branch=Branch;
	}
	Bankac(Bankac a1){
		this.acnum=a1.acnum;
		this.Acname=a1.Acname;
		this.balance=a1.balance;
		this.Branch=a1.Branch;
		
	}
	Bankac(Bankac a1,double balance,String branch){
		this.acnum=a1.acnum;
		this.Acname=a1.Acname;
		this.balance=balance;
		this.Branch=branch;
	}
	

	public static void main(String[] args) {
Bankac a1=new Bankac(20210,"Ankitha",2000000,"Dornakal");
	a1.display();
	Bankac a2=new Bankac(a1);
	
	
	a2.Branch="kphb";
	a2.balance=30000000;
	a2.display();
	Bankac a3=new Bankac(a1,500000,"hyd");
	a3.display();
}
	void display() {
		System.out.println("Accountnumber:"+acnum);
		System.out.println("Acname:"+Acname);
		System.out.println("balance:"+balance);
		System.out.println("Branch:"+Branch);
	}

}
