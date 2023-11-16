package org.string;

public class DublicateString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = ("the animal name is elephant");
		char [] ani = name.toCharArray();
		System.out.println("Before find the dublicate character the string name is:"+ " "+name);
		
		for (int i=0;i<name.length();i++) {
			for (int j=i+1;j<name.length();j++) {
				
			if (ani[i]==ani[j]) {
				
				System.out.print(ani[j]+" ");
				break;
			}
			}
			
		}

		}
}



