package org.string;

public class DublicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = ("good morning");
		
		char[] carray = word.toCharArray();
		
		System.out.println("before find the dublicate:" + word);
		
		System.out.println("The dublicate character of the string is");
		
		
		for (int i=0;i<word.length();i++) {
		
		for (int j=i+1;j<word.length();j++) {
		
		if (carray[i]==carray[j]) {
			
			System.out.println(carray[j] +" ");
			break;
		}

	}

}
	}
}
