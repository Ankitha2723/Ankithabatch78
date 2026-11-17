package com.oops.inheritance;
class Employe1 implements Cloneable{
	int id;
	String name;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Employe1(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

public class TestDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employe1 e1=new Employe1(1,"Anshu");
		Employe1 e2=(Employe1) e1.clone();
		System.out.println("original object data");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println("clone object data");
		System.out.println(e2.id);
		System.out.println(e2.name);
		// TODO Auto-generated method stub

	}

}
