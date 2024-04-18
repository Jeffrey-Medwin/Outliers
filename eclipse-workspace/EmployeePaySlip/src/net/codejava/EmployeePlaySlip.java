package net.codejava;

import java.util.Scanner;

public class EmployeePlaySlip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String employeeName;
		int employeeNumber;
		int yearOfExperience;
		double basicSalary ;
		double grossSalary;

		System.out.print("Enter Employee Name: ");
		employeeName = sc.nextLine();
		
		System.out.print("Enter Employee Number: ");
		employeeNumber = sc.nextInt();
		
		System.out.print("Enter Employee's Year of Experence: ");
		yearOfExperience = sc.nextInt();
		
		System.out.print("Enter Employee's Basic Salary: ");
		basicSalary = sc.nextDouble();
		
		sc.close();
		
		CalculationAndDisplay cd = new CalculationAndDisplay();
		
		if(yearOfExperience > 10) {             //For Experience more than 10 years
			grossSalary = cd.calculation(basicSalary, 0.8, 0.18, 1800, 0.22);
		}
		else if(yearOfExperience > 7) {         //For experience more than 7 years
			grossSalary = cd.calculation(basicSalary, 0.6, 0.15, 1600, 0.18);
		}
		else if(yearOfExperience > 5) {        //For experience more than 5 years
			grossSalary = cd.calculation(basicSalary, 0.5, 0.12, 1200, 0.15);
		}
		else { 									// For experience less than 5 years 
			grossSalary = cd.calculation(basicSalary, 0.4, .12, 1000, 0.1);
		}
		cd.display(employeeName, employeeNumber,  yearOfExperience, grossSalary);   //To display details
	}
}
