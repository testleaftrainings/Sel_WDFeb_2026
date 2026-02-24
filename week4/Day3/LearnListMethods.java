package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<Integer> value1 = new ArrayList<Integer>();
		System.out.println(value1);
		// add();
		value1.add(7);
		value1.add(18);
		value1.add(18);
		System.out.println(value1);

		List<Integer> value2 = new ArrayList<Integer>();
		System.out.println(value2);
		// addAll();
		// value2 - 0 vaalues - value1 - 2
		value1.addAll(value2); // 7,18 0
		System.out.println(value1); // 7,18
		value2.add(45);
		System.out.println(value1);// 7, 18
		value1.addAll(value2);// 7,18 addAll 45
		System.out.println(value1);

		// get - index starts from 0.
		System.out.println("The value present in the index(2) in value1 " + value1.get(2));

		// remove - Based on index - index value starts with 0
		// value1.remove(0);
		// value2.remove(0);
		// System.out.println("After removing 0th index in value1 "+value1);
		// System.out.println("After removing 0th index in value2 "+value2);

		// removeAll -
		// value1.removeAll(value1);
		System.out.println("after removeAll from value1 " + value1);

		// size - index value starts with 1
		System.out.println(value1);
		System.out.println("size of the list value1 " + value1.size());
		
		//Clear & remove all
		System.out.println("1 "+value1);
		//value1.clear();
		//System.out.println("value1 After clear " + value1);
		value1.removeAll(value2);
		System.out.println("2 "+value1);
		
		// clear - removes all the values
		value2.clear();
		value1.clear();
		System.out.println("value2 After clear " + value2);
		System.out.println("value1 After clear " + value1);

	}
}
