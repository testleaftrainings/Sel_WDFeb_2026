package week2.day1;

public class LearnIteration {

	public static void main(String[] args) {
		// Iteration - for, forEach
		int number = 10;

		// int i = 0; - Initialization
		// i < args.length; - Condition
		// i++ - Increment/Decrement
		for (int i = 0; i < number; i++) {
			if (i == 3) {
				System.out.println("The given value is Equal to 3");
			} else if (i == 7) {
				System.out.println("The given value is Equal to 7");
				continue;
			}
			System.out.println(i);
		}
	}

}
