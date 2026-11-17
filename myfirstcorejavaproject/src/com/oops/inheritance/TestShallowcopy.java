package com.oops.inheritance;
class Employee implements Cloneable{
	int id;
	String name;
	Address address;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

public Employee(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
	
}
}
class Address{
	String city;




public Address(String city){
	
	this.city = city;;
}
}
public class TestShallowcopy {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Address add=new Address("dornakal");
		Employee emp1=new Employee(1,"Ankitha",add);
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city);
		Employee emp2=(Employee)emp1.clone();
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city);
		System.out.println("**********************************************");
		emp2.id=2;
		emp2.name="Madhusri";
		emp2.address.city="Hyderabadh";
	
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city);
	
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city);
		
		// TODO Auto-generated method stub

	}
}


