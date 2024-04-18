package net.codejava;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 1;
		int next = 0;
		int i;
		int numberToVerify;
		System.out.print("Enter the number to verify: ");
		numberToVerify = sc.nextInt();
		sc.close();
		if ( numberToVerify == 0 || numberToVerify == 1 ) {
			System.out.println(numberToVerify + " is present in fibonacci series");
		} 
		else {
			for( i = 2; i <= numberToVerify; i++ ) {
				next = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = next;
				if( numberToVerify == next ) {
					System.out.println("\n" + numberToVerify + " is present in fibonacci series");
					break;
				}
				else if( numberToVerify < next ) {
					System.out.println("\n" + numberToVerify + " is not present in fibonacci series");
					break;
				}
			}
		}
	}
}