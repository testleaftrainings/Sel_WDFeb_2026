package week2.day2;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {
		//String Literal - Heap(String constant pool)
		String name = "Salma";
		
		//String Instantiation - Directly into the Heap memory
		String varName = new String("Abinaya");
		
		//.length(); - value starts from 1
		System.out.println("No.of.Characters in name "+ name.length());
		
		//.equals(); 
		if (name.equalsIgnoreCase(varName)) {
			System.out.println("Both the String values are same");
		}else {
			System.out.println("Both the String values are not same");
		}
		
		String refName = "manasa";
		String newRefName = "Sukiram";
		//.contains();
		boolean contains = refName.contains("z");
		System.out.println(contains);
		
		//toCharArray();
		String character = "Murali";
		char[] charArray = character.toCharArray();
		
		for (int i =  charArray.length-1; i >=0 ; i--) {
			System.out.println(charArray[i]);
		}
		
		//charAT();
		System.out.println("The Character in the index 3 is " + character.charAt(3));
		
	}

}
