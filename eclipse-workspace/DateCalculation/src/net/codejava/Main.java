package net.codejava;

import java.util.Scanner;

class dateCalculation {   //A class for date 
	
	public int date(int startingDate, int endingDate) {    // a method of date calculation
		if(startingDate < endingDate) {    // if starting date is less than ending date
			return (startingDate - endingDate) + 30;      // do subtraction and add 30 because a moth has 30 days and to ignore negative value
		}
		else {   // if starting date is less than ending date
			return startingDate - endingDate;        // just do subtraction
		}
	}

	// for months we have to consider month and days because month is dependent on days
	public int month(int startingMonth, int endingMonth, int startingDate, int endingDate) {    // a method for month calculation

		if (startingMonth < endingMonth && startingDate < endingDate) {   // if starting month and year is less than ending month and year
			return (endingMonth - startingMonth) + 1;        // do subtraction and add 1 to ignore negative value
		}
		// if starting month is less and staring date is greater or equal to ending
		else if (startingMonth < endingMonth && startingDate >= endingDate) {  
			return (startingMonth - endingMonth) + 12;  //subtract and add 12 to get accurate value
		}
		else {    // if starting month is greater that ending 
			return startingMonth - endingMonth;    // just subtraction is enough 
		}
	}
	
//  here the years are full dependent on months not on itself too o compare only months
	public int year(int startingMonth, int endingMonth, int startingYear, int endingYear) {   // a method it find year difference
  
		if(startingMonth < endingMonth) {    // if starting month is lesser 
			return (startingYear - endingYear) - 1;    // subtract the years and also do subtract by 1 for accurate value 
		}
		else {      // if starting month is greater 
			return startingYear - endingYear;    // then just subtraction in years are enough
		}
	}
}

class timeCalculation extends dateCalculation{  // a class to deal with time also inherits the date class
	
	public int seconds(int startingSecond, int endingSecond) {   // a method to calculate seconds
		if (startingSecond < endingSecond) {    // if starting seconds is lesser 
			return (startingSecond - endingSecond) + 60;    // do subtract those to years and add by 6-0 to avoid negative values
		} 
		else {      // if starting seconds is larger 
			return startingSecond - endingSecond;    // just simple subtraction is enough  
		}
	}
	
	// minutes are dependent on seconds too hence check with both 
	public int minute(int startingMinute, int endingMinute, int startingSecond, int endingSecond) {  // a method to calculate minutes
	
		//if starting minute is greater than or equal to ending minute and starting second is greater 
		if (startingMinute <= endingMinute  && startingSecond < endingSecond) {    
			return (startingMinute - endingMinute) +59;          // do subtraction and add with 59 to get accurate result
		}
		// if starting minute is greater and equal to ending and the seconds are equal 
		else if (startingMinute >= endingMinute && startingSecond == endingSecond) {
			return startingMinute - endingMinute;     //  just do subtraction
		}
		else {   // if both starting values are greater 
			return (startingMinute - endingMinute) - 1;    // do subtraction and also subtract by 1 to get accurate result
		}
	}
	
	//the hours are dependent on minutes too
	public int hour(int startingHour, int endingHour, int startingMinute, int endingMinute) { // method to calculate hours
		//if starting hour is greater than or equal and starting minute is greater
		if(startingHour >= endingHour && startingMinute > endingMinute) {  
			return startingHour - endingHour;     // just do subtraction
		}
		else if (startingHour < endingHour && startingMinute > endingMinute) {  // starting hour is greater and starting minute is lesser 
			return (endingHour - startingHour) - 1;    // subtract ending hour with starting hour also subtract with 1  
		}
		else {     // if any other condition occurs then do the previous subtraction in vice-versa form
			return (startingHour - endingHour) - 1;
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   // Initializing scanner
		// Variable declaration
		int startingSecond;
		int endingSecond;
		
		int startingMinute; 
		int endingMinute;
		
		int startingHour;
		int endingHour;
		
		int startingDate;
		int endingDate;
		
		int staringMonth;
		int endingMonth;
		
		int startingYear;
		int endingYear;
		
		int secondDifference;
		int minuteDifference;
		int hourDifference;
		int daydifference;
		int monthDifference;
		int yearDifference;
		
		System.out.print("Enter first date and time: ");   // asking the user for input values of date and hour 1
		startingDate = scanner.nextInt();
		staringMonth = scanner.nextInt();
		startingYear = scanner.nextInt();
		startingHour = scanner.nextInt();
		startingMinute = scanner.nextInt();
		startingSecond = scanner.nextInt();
		
		System.out.print("Enter second date and time: ");    // asking the user for input values of date and hour 2
		endingDate = scanner.nextInt();
		endingMonth = scanner.nextInt();
		endingYear = scanner.nextInt();
		endingHour = scanner.nextInt();
		endingMinute = scanner.nextInt();
		endingSecond = scanner.nextInt();
		
		scanner.close();   // close the scanner to ignore warning 
		
		timeCalculation calculation = new timeCalculation();   // initialize object for the time class as it extends date calss too
		
		//  get the values from all the return method
		secondDifference = calculation.seconds(startingSecond, endingSecond);  
		minuteDifference = calculation.minute(startingMinute, endingMinute, startingSecond, endingSecond);
		hourDifference = calculation.hour(startingHour, endingHour, startingMinute, endingMinute);
		daydifference = calculation.date(startingDate, endingDate);
		monthDifference = calculation.month(startingMinute, endingMonth, startingDate, endingDate);
		yearDifference = calculation.year(staringMonth, endingMonth, startingYear, endingYear);
		
		System.out.println(  // print out all those values
				"The difference is " + yearDifference + " years  " + monthDifference + " moths  " + daydifference + " days  and " + 
				hourDifference + " hours  " + minuteDifference + " minutes  " + secondDifference + " seconds."
			);
	}
}