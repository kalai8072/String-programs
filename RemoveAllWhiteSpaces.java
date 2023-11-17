package org.string;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String words = (" Cricket is my fav sport ");
		
		System.out.println("The original word is :  Cricket is my fav sport" );
		
	 String replace = words.replaceAll(" ", ""); 
	 
	 System.out.println("After remove the whitespaces:"+" "+ replace);

	}

}
