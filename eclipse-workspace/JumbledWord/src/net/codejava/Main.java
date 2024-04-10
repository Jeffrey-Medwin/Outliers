package net.codejava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   //Initializing scanner 
		
		int inputNumber;        //Variable declaration
		boolean trueOrNot;

		System.out.print("Enter a input: ");       //Getting user input
		inputNumber = scanner.nextInt();
		scanner.close();
		
		IsJumbled jumbled = new IsJumbled();      //calling method to find jumbled number  
		
		
		for (int i = 0; i <= inputNumber; i++) {
			trueOrNot = jumbled.jumbledOrNot(i);
			if (trueOrNot) {
				System.out.println(i);
			}	
		}
	}
}