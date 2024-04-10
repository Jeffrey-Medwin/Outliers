package net.codejava;

public class SpecialCharacterPercentage {
	
	// Got the count as the parameter  or argument of the method
	public void specialCharacterPercentage(float specialCharacterCount, float totalCount) {  
		float percentage;
		percentage = specialCharacterCount * 100 / totalCount;    // formula to calculate the percentage
		System.out.format("Number of Special Character is %.0f. So, Percentage is %.2f%%\n", specialCharacterCount, percentage);
	}
}