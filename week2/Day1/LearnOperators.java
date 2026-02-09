package week2.day1;

public class LearnOperators {

	public static void main(String[] args) {

		/*
		 * //**Operators 1.Arithmetic operators 2.Assignment operators 3.Comparison
		 * operators 4.Logical operators 5.Unary operators
		 */

		// Arithmetic operators : + , -, *, /, %
		int a = 8;
		int b = 4;
		int c = a % b;
		System.out.println(c);
		boolean d;
		d = a > b;
		System.out.println(d);

		// unary operator
		// Increment operator (++)
		// Decrement operator (--)

		int i = 7;
		int j = 18;

		// post Increment
		System.out.println(i++);// 7
		System.out.println(i);// 8
		// pre-Increment
		System.out.println(++i);// 9

		// Decrement operator (--)
		// pre-decrement
		System.out.println(--i);// 6 , 8 , 7
		System.out.println(i);// 6,7,8
		// post-Increment
		System.out.println(i--);// 8,6,5
		

	}

}
