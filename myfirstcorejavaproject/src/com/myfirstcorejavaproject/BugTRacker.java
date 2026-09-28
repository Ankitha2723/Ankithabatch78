package com.myfirstcorejavaproject;
//import java.util.Scanner;

public class BugTRacker {
	int bugid;
    String apname;
    String bugtitle;
    String severity;
    String priority;
    String status;
    String assigneddeve;
	

 void main() {
		
	System.out.println("main method started");
	BugTRacker b1= new BugTRacker();
	b1.bugid=20;
	b1.apname="Ankitha";
	System.out.println(bugid);
	System.out.println(apname);
	
	
		// TODO Auto-generated method stub

	}
	int getBugid() {
		System.out.println(bugid);
		return bugid;
	}
	String getapname() {
		return apname;
	}
	
	

}
