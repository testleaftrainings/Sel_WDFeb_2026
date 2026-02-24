package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// a,e,i,o,u
		char[] setValue = { 'a', 'i', 'e', 'o', 'u', 'e' };
		// HashSet, TreeSet, LinkedHashSet
		Set<Character> unique = new TreeSet<Character>();
		// HashSet - Randomorder - doesnot follow insertion order - Follow random order
		// LinkedHashSet -  follow insertion order
		// TreeSet - ASCII
		// unique.add('y');
		// unique.add('Y');
		System.out.println(unique);

		for (Character i : setValue) {
			unique.add(i);
		}
		System.out.println(unique);
		unique.add('y');
		System.out.println(unique);
		
		
		
	}

}
