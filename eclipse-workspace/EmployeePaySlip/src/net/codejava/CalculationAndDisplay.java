package net.codejava;

public class CalculationAndDisplay {

	//calculation of the employees gross salary
	double calculation(double basicSalary, double dearnessAllowance, double providentFund, double conveyance, double bonus) {
		
		double totalAddition;
		double totalDeduction;
		
		double HOUSE_RENT_ALLOANCE = 5000;
		double EMPLOYEE_STATE_INSURANCE = 150;
		double PROFESSIONAL_TAX = 82;
		
		dearnessAllowance *= basicSalary;   //percentage of dearness allowance
		providentFund *= basicSalary;       //percentage of provident fund
		bonus *= basicSalary;               //percentage of bonus
		
		totalAddition = basicSalary + dearnessAllowance + HOUSE_RENT_ALLOANCE + conveyance + bonus;   // provides the value that was to be added with the salary
		totalDeduction = providentFund + EMPLOYEE_STATE_INSURANCE + PROFESSIONAL_TAX;            //provides the value that has to be subtracted from the salary
		
		return totalAddition - totalDeduction;        //this subtraction will provide the gross salary
	}
	
	//prints the details of the employee by getting the info as the parameter
	void display(String employeeName, int employeeNumber, int yearOfExperience, double grossSalary) {
		System.out.println("\n\n=+=+=+= Employee Details =+=+=+=");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Number: " + employeeNumber);
		System.out.println("Employee's Year of Experience: " +  yearOfExperience);
		System.out.println("Emplyee's Gross Salary: " + grossSalary);
	}
}
