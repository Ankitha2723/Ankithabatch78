package com.myfirstcorejavaproject;

public class Theatre {
	static String theatername;
	static String theaterloc;
	String moviename;
	int moviebudget;
	String releasedate;

	public static void main(String[] args) {
		System.out.println("main method started");	
		theatername ="venkataramana";
		theaterloc="warangal";
		Theatre m1=new Theatre();
		m1.moviename= "irumudi";
		m1.moviebudget=200000;
		m1.releasedate="2026-07-24";
		System.out.println("theatername:"+theatername);
		System.out.println("theaterloc:"+theaterloc);
		
		System.out.println("moviename:"+m1.moviename);
		System.out.println("moviebudget:"+m1.moviebudget);
		System.out.println("releasedate:"+m1.releasedate);
		System.out.println("object2 info ******");
		theatername ="pvr";
		theaterloc="warangal";
		Theatre m2=new Theatre();
		m1.moviename= "toxic";
		m1.moviebudget=250000;
		m1.releasedate="2026-07-28";
		System.out.println("theatername:"+theatername);
		System.out.println("theaterloc:"+theaterloc);
		
		System.out.println("moviename:"+m2.moviename);
		System.out.println("moviebudget:"+m2.moviebudget);
		System.out.println("releasedate:"+m2.releasedate);
		System.out.println("object3 info ******");
		theatername ="vinodha";
		theaterloc="khmm";
		Theatre m3=new Theatre();
		m1.moviename= "raja";
		m1.moviebudget=250000;
		m1.releasedate="2026-07-28";
		System.out.println("theatername:"+theatername);
		System.out.println("theaterloc:"+theaterloc);
		
		System.out.println("moviename:"+m3.moviename);
		System.out.println("moviebudget:"+m3.moviebudget);
		System.out.println("releasedate:"+m3.releasedate);
		System.out.println("object4 info ******");
		theatername ="pvr";
		theaterloc="warangal";
		Theatre m4=new Theatre();
		m1.moviename= "pushpa";
		m1.moviebudget=250000;
		m1.releasedate="2026-05-28";
		System.out.println("theatername:"+theatername);
		System.out.println("theaterloc:"+theaterloc);
		
		System.out.println("moviename:"+m4.moviename);
		System.out.println("moviebudget:"+m4.moviebudget);
		System.out.println("releasedate:"+m4.releasedate);
		
		
		System.out.println("main method ended");
		

		// TODO Auto-generated method stub

	}

}
