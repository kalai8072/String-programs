package org.string;

import java.util.Arrays;
import java.util.Collections;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = ("Michael Kalai");
		char c = 'a';
		
		//name.split(name);
		//String.valueOf(c);
		
		 System.out.println(Collections.frequency(
		            Arrays.asList(name.split("")),
		            String.valueOf(c)));
	}

}
