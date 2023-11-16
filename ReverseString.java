package org.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse string by using String builder

		/*
		 * String turn = "Today is a Friday"; StringBuilder str = new
		 * StringBuilder(turn); //str.append(turn); str.reverse();
		 * 
		 * System.out.println(str);
		 */

		// Reverse string by using String buffer.

		String turn = "Today is a Friday";
		StringBuffer input = new StringBuffer(turn);
		input.reverse();

		System.out.println(input);
	}
}
