package net.codejava;

import java.util.ArrayList;

public class FindMostRepeated {
	int i;
	int j;
	int count;
	int highestCount;
	String mostRepeatedWord;
	
	public void findRepeated(ArrayList<String> stringList) {
		highestCount = 0;
		mostRepeatedWord = " ";
		for ( i = 0; i < stringList.size(); i++) {
			count = 0;    // set count to 0 in first loop so we can get count for each word
			for ( j = 0; j < stringList.size(); j++) {
				if (stringList.get(i).equals(stringList.get(j))) { 
					count++;      /// increment the count if the word matches
				}
				if (highestCount < count) {    //if highest count is less than the count
					highestCount = count;     // then set count to highest count
					mostRepeatedWord = stringList.get(i);     // get the most repeated word
				}
			}
		}
	}
	
	public int repeatedCount() {   ///method to return the highest count
		return highestCount;
	}
	public String repeatedWord() {     // method to return the repeated word
		return mostRepeatedWord;
	}
}
