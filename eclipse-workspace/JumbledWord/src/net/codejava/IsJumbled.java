package net.codejava;


public class IsJumbled {
	public boolean jumbledOrNot(int inputNumber) {
		int firstNumber;
		int secondNumber;
		
		if (inputNumber / 10 == 0) {
			return false;
		}

			while (inputNumber != 0) {   // if input is not equal to 0 goto loop
			
				if ( inputNumber / 10 == 0) {   // if single digit return to terminate
					return true;
				}
			
				firstNumber = inputNumber % 10;   //extracting last variable
				secondNumber = (inputNumber / 10 ) % 10;  //extracting second last variable

				if (secondNumber - firstNumber != -1 && secondNumber - firstNumber != 1) {
					return false;    // if the difference of the extracted number is not equal to 1 or -1 then return false
				}
			
				inputNumber /= 10;   //clearing off the last digit to go further
			}
		
			return true;
			
		}
	
}