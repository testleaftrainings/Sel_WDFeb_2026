package week2.day3;

public class StringMethods {

	public static void main(String[] args) {
		
		//.split();
		String name = "Good morning Geetha";
		
		String[] split = name.split("o");
		//System.out.println(split);
		//using loop concept
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		//.replace();
		String repName = "Vanitha";
		String replaced = repName.replace('a', '@');
		System.out.println(replaced);
		
		//.replaceAll();
		//[0-9] [A-Z] [a-z] [@#$%&*?/]
		String repAll = "Welcome to testleaf @ 2026";
		String replaceAll = repAll.replaceAll("[0-9]", "@");
		System.out.println(replaceAll);
		
		//.toLowerCase();
		String loWCase = "SEENIVASAN";
		System.out.println(loWCase.toLowerCase());
		
		//.toUpperCase();
		String upCase = "anbu";
		System.out.println(upCase.toUpperCase());
		
		//.parseInt();
		String price = "49999";
		int int1 = Integer.parseInt(price);
		System.out.println(int1);
		//Interger
		//parseInt
		//pr
		
	}

}
