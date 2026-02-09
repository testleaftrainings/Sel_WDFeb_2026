package week2.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browserName = "Chrome";
		
		switch (browserName) {
		case "Chrome":
			System.out.println("The current execusion is in Chrome");
			break;
		case "FireFox":
			System.out.println("The current execusion is in FireFox");
			break;
		case "Edge":
			System.out.println("The current execusion is in Edge");
			break;
		case "Safari":
			System.out.println("The current execusion is in Safari");
			break;
		default:
			System.out.println("The current execusion is in IE");
			break;
		}
	}

}
