package org.string;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		// initialize the string
		// split the string into words
		// Count the total words
		
		String name = ("Today is a thursday!");
		
		System.out.println("The word is:" + " " + name);
		
		String[] arraystr = name.split(" ");
		
		int totalwords = arraystr.length;
		
		System.out.println("The number of words is:" + " " + totalwords);
	}


}
    