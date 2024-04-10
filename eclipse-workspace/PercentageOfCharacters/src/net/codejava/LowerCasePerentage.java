package net.codejava;

public class LowerCasePerentage {
	float count;
	float percentage;
	public void lowerCasePerentage(String inputString) { 
		for(int i = 0; i < inputString.length(); i++) {          // A loop to iterate over the string
			if(inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z') {       // A if condition to check for Lower case letter
				count++;                // If got lower case increment the count
			}
		}
		percentage =  ((count * 100) / (inputString.length()));
		System.out.format("Number of Upper Case letter is %.0f. So, Percentage is %.2f%%\n", count, percentage);
	}
}