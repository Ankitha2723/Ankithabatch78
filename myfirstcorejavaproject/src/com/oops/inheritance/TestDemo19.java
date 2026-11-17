package com.oops.inheritance;
class Emp implements Cloneable{
	int id;
	String name;
	Department department;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public Emp(int id, String name, Department department) {
	
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
}
class Department{
	String department;
	String location;
	public Department(String department, String location) {
	
		this.department = department;
		this.location = location;
	}
	
}

public class TestDemo19 {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Department dep=new Department("cse","hyd");
		Emp e1=new Emp(1,"Chitti",dep);
		Emp e2=(Emp)e1.clone();

        System.out.println("Are Employee objects same?");
        System.out.println(e1 == e2);

        System.out.println("Are Department objects same?");
        System.out.println(e1.department == e2.department);

		
		e2.department.location="khamm";

        System.out.println("Original location: " + e1.department.location);
        System.out.println("Cloned location: " + e2.department.location);
		
		// TODO Auto-generated method stub

	}

}
