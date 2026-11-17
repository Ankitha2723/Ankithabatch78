package com.oops.inheritance;



	
	class Employeee implements Cloneable{
		int id;
		String name;
		Addresss address;
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

	public Employeee(int id,String name,Addresss address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	}
	class Addresss{
		String city;
	




	public Addresss(String city){
		
		this.city = city;
		
	}
	}
	public class TestDemo2  {

		public static void main(String[] args) throws CloneNotSupportedException  {
			Addresss add=new Addresss("dornakal");
			Employeee emp1=new Employeee(1,"Ankitha",add);
			System.out.println(emp1.id);
			System.out.println(emp1.name);
			System.out.println(emp1.address.city);
			Employeee emp2=(Employeee)emp1.clone();
			
			emp2.address.city="Hyderabadh";
		
			
			System.out.println(emp2.id);
			System.out.println(emp2.name);
			System.out.println(emp2.address.city);
			
			// TODO Auto-generated method stub

		}
	}
	
