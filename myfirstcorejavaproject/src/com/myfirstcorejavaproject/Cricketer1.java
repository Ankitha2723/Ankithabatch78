package com.myfirstcorejavaproject;

public class Cricketer1 {
	static int CountryId;
	static String countryname;
	int jersynumber=999;
	String cricketername="unknown";
	
	public static void main (String [] args) {
		System.out.println("main method started");
		System.out.println("welcome to main indian cricket team");
		CountryId=91;
		countryname="India";
	System.out.println("Countryid:" + CountryId);
	 System.out.println("countryname:" + countryname);

		CountryId=91;
		countryname="India";
		Cricketer1 msd = new Cricketer1();
		msd.jersynumber=7;
		msd.cricketername="mahendra singh dhoni";

		System.out.println("jersynumber:"+msd.jersynumber);
		System.out.println("cricketername:"+msd.cricketername);
		System.out.println("object 2 info ************");
		Cricketer1 vk= new Cricketer1();
		vk.jersynumber=18;
		vk.cricketername="virat kohli";
		System.out.println("Countryid:" + CountryId);
		 System.out.println("countryname:" + countryname);

		System.out.println("jersynumber:" +vk.jersynumber);
		System.out.println("cricketername:" +vk.cricketername);
		System.out.println("object3 info ***********");
		Cricketer1 hitman=new Cricketer1();
		CountryId=92;
		countryname="Indo";
		hitman.jersynumber=45;
		hitman.cricketername="Rohith sharma";
		
		//vk.jersynumber=45;
		//vk.cricketername="rohith sharma";
		System.out.println("Countryid:" + CountryId);
		 System.out.println("countryname:" + countryname);
		 System.out.println("jersynumber:" +hitman.jersynumber);
			System.out.println("cricketername:" +hitman.cricketername);
			System.out.println("object4 info ***********");
			Cricketer1 sd=new Cricketer1();
			CountryId=92;
			countryname="Indo";
			
			//vk.jersynumber=45;
			//vk.cricketername="rohith sharma";
			System.out.println("Countryid:" + CountryId);
			 System.out.println("countryname:" + countryname);
			 System.out.println("jersynumber:" +sd.jersynumber);
				System.out.println("cricketername:" +sd.cricketername);
			System.out.println("main method ended");

		}
}
