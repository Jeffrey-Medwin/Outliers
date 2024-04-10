package net.codejava;

public class UpperCasePercentage {
	float count;
	float percentage;
	public void upperCasePercantage(String inputString) {
		for(int i = 0; i < inputString.length(); i++) {      // A loop to iterate over the string
			if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {     // A if condition to check for upper case letter
				count++;                      // If got upper case increment the count
			}
		}
		percentage =  ((count * 100) / (inputString.length()));    //Find Percentage percentage using the percentage formula
		System.out.format("Number of Upper Case letter is %.0f. So Percentage is %.2f%%\n", count, percentage);
	}
}