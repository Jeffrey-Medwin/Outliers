package net.codejava;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Variable declaration
		String userInputString;
		int totalCount;
		float specialCharacterCount;
		
		System.out.print("Enter the string: ");             // getting input from the user
		userInputString = scanner.nextLine();
		scanner.close();
		
		totalCount = userInputString.length();        
		
		UpperCasePercentage upperCase = new UpperCasePercentage();         //creating an object for upper case case
		upperCase.upperCasePercantage(userInputString);                    // calling the upper case method
		LowerCasePerentage lowerCase = new LowerCasePerentage();           //creating an object for lower case class
 		lowerCase.lowerCasePerentage(userInputString);                     // calling the lower case method  
		DigitPercentage digit = new DigitPercentage();                     //creating an object for digit class
		digit.digitPercentage(userInputString);                            // calling the digit method
		
		//subtracting the total character from each of the method to get the count of special character and white space
		specialCharacterCount = totalCount - (upperCase.count + lowerCase.count + digit.count);   
		SpecialCharacterPercentage specialCharacterPercentage = new SpecialCharacterPercentage();
		specialCharacterPercentage.specialCharacterPercentage(specialCharacterCount, (float)totalCount);	
	}
}