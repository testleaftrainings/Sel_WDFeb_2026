package week2.day3;

import java.util.Arrays;

public class LearnArrrays {

	public static void main(String[] args) {
		
		//Arrays - Literal
		//Length starts with 1
		//Size starts with 0
		int[] marks = {89, 88, 72, 96, 99};
		//0- 89; 1- 88, 2- 72, 3- 96, 4- 99.
		
		//To find the length of the Array
		int length = marks.length;
		System.out.println("the length of the marks is "+length);
		
		//To print the random value based on size
		//System.out.println(marks[3]);
		
		//How to retrive all the values - loop
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		//To print the lowest to highest value
		//Sort - Arrays
		//Arrays.sort(marks);
		
		//Lowest Value
		System.out.println("After sorting "+marks[0]);
		
		//Print the Highest value
		System.out.println("Highest value "+marks[marks.length-2]);
		
		//Arrays - Instantiation
		//Memory allocation first
		int[] score = new int[5];
		score[0] = 89;
		score[1] = 88;
		score[2] = 99;
		score[3] = 96;
		score[4] = 72;
	}

}
