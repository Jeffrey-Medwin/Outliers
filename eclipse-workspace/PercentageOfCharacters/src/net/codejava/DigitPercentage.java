package net.codejava;

public class DigitPercentage {
	float count;
	float percentage;
	public void digitPercentage(String inputString) {
		for(int i = 0; i < inputString.length(); i++) {             // A loop to iterate over the string
			if(inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {     // A if condition to check for digit then letter
				count++;          // If got digit then increment the count
			}
		}
		percentage =  ((count * 100) / (inputString.length()));
		System.out.format("Number of Digit is %.0f. So, Percentage is %.2f%%\n", count, percentage);
	}
}