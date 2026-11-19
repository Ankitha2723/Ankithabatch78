package com.oops.inheritance;

import java.util.Scanner;

class Employee12{
	int employeeId;
      String employeeName;
      double basicSalary;
void  calculateSalary() {
	System.out.println("employeeid:"+employeeId);
	System.out.println("employee name:"+employeeName);
	System.out.println("salary :"+basicSalary);
}
}
class Developer extends Employee12{
	
	
	@Override
    void calculateSalary() {

        double bonus = basicSalary * 20 / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Tester extends Employee12 {

    @Override
    void calculateSalary() {

        double bonus = basicSalary * 10 / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }


	public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Basic Salary:");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Role (Developer/Tester):");
        String role = sc.nextLine();

        Employee12 emp;

        if (role.equalsIgnoreCase("Developer")) {

            emp = new Developer ();

        } else if (role.equalsIgnoreCase("Tester")) {

            emp = new Tester();

        } else {
            System.out.println("Invalid Employee Role");
            sc.close();
            return;
        }

        emp.employeeId = id;
        emp.employeeName = name;
        emp.basicSalary = salary;

        emp.calculateSalary();

        sc.close();
    }
}
	