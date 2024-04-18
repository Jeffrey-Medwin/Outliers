package net.codejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatingWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);       //initializing scanner
		ArrayList<String> stringList;                   // initializing arrayList
		String userInputString;                         //Declaring variables
		int sizeOfList;
		float percentage;
		System.out.print("Enter the input (Enter '#' for termination): ");			
		userInputString = scanner.nextLine();			//getting sting as input from the user
		
		if(userInputString.equals(" ")) {               //if condition to check weather the user has entered the input
			System.out.println("Enter the input");
		} else {                                         // moves to else part if the user enter the input
			// making substring till '#' and converting to lower case
			userInputString = userInputString.substring(0, userInputString.indexOf("#")).toLowerCase();  
			// Spiting the string based on white space and adding to arrayList
			stringList = new ArrayList<String>(Arrays.asList(userInputString.split("\\s+")));	
			sizeOfList = stringList.size();             // Getting the size of the array to find percentage later
			if (sizeOfList <  2) {                      // if user ha entered less than 2 words then exit
				System.out.println("Enter atleast two words");
			} else {                                  // else
				FindMostRepeated findMostRepeated = new FindMostRepeated();
				findMostRepeated.findRepeated(stringList);     //calling the method to find repeated string 
		
				percentage = (float)findMostRepeated.repeatedCount() * 100 / (float)sizeOfList;  //finding percentage 
		
				System.out.println (
						"The word " + findMostRepeated.repeatedWord() + " has occured for " + 
						findMostRepeated.repeatedCount() + 
						" times and the percentage of occurence is " + percentage + "%"
					);
			}
		}
	}
}