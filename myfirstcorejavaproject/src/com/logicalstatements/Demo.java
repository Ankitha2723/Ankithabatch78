package com.logicalstatements;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub```java
		

		    
		        Scanner sc = new Scanner(System.in);

		        System.out.println("******** NOUKRI JOB APPLICATION ********");

		        System.out.print("Enter your name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter your qualification: ");
		        String qualification = sc.nextLine();

		        if (qualification.equalsIgnoreCase("BTech")) {

		            System.out.println("Qualification accepted.");

		            System.out.print("Enter your year of passing: ");
		            int year = sc.nextInt();

		            if (year >= 2022 && year <= 2026) {

		                System.out.println("Year of passing accepted.");

		                sc.nextLine(); // Clear the leftover newline

		                System.out.print("Enter your skills: ");
		                String skills = sc.nextLine();

		                if (skills.equalsIgnoreCase("Java")
		                        || skills.equalsIgnoreCase("Python")
		                        || skills.equalsIgnoreCase("MySQL")) {

		                    System.out.println("Your skills match our requirements.");

		                    System.out.print("Enter your percentage: ");
		                    float percentage = sc.nextFloat();

		                    if (percentage >= 65 && percentage <= 100) {

		                        System.out.println("Percentage accepted.");

		                        System.out.print("Enter your experience in years: ");
		                        int experience = sc.nextInt();

		                        if (experience >= 0 && experience <= 4) {

		                            System.out.println("Experience requirement satisfied.");

		                            System.out.print("Enter your expected monthly salary: ");
		                            int salary = sc.nextInt();

		                            if (salary >= 30000 && salary <= 60000) {

		                                System.out.println();
		                                System.out.println("Congratulations, " + name + "!");
		                                System.out.println(
		                                    "You are eligible to apply for the Software Developer job."
		                                );

		                            } else {

		                                System.out.println(
		                                    "Your salary expectations do not match our requirements."
		                                );
		                                System.out.println("You are not eligible for this job.");

		                            }

		                        } else {

		                            System.out.println(
		                                "Your experience does not match our requirements."
		                            );

		                        }

		                    } else {

		                        System.out.println(
		                            "Your percentage must be between 65 and 100."
		                        );

		                    }

		                } else {

		                    System.out.println(
		                        "Your skills do not match our requirements."
		                    );

		                }

		            } else {

		                System.out.println(
		                    "You are not eligible based on your year of passing."
		                );

		            }

		        } else {

		            System.out.println(
		                "Sorry, this job requires a BTech qualification."
		            );

		        }

		        sc.close();
		  

	}

}
