package com.logicalstatements;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a day");
		String day=sc.next();
		switch(day) {
		case"Monday"->{System.out.println("lazy day");
		System.out.println("starting week");
		}
		case"tuesday","wednesday","thursaday"->System.out.println("routine days");
		case"friday"->System.out.println("weekend mood enterd");
		case"saturday"->System.out.println("weekend");
		case"sunday"->{System.out.println("cricket day");
		System.out.println("rest day");
		}default->System.out.println("ivalide data enterd");
		
		}
		// TODO Auto-generated method stub

	}

}
