package week3.day4;

public class LearnMethodOverLoading {
	//Static polymorphism / compiletime polymorphism / Early Binding
	//Same class, same method signature but Diff in arguments
	
	public void addNumber(int a, int b) {
		System.out.println("Two int type value is added");
		System.out.println(a+b);
	}
	
	public void addNumber(long a, long b) {
		System.out.println("Two long type value is added");
		System.out.println(a+b);

	}
	
	public void addNumber(double a, double b) {
		System.out.println("Two double type value is added");
		System.out.println(a+b);

	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading add = new LearnMethodOverLoading();
		add.addNumber(657547l, 63653778l);
		
	}

	//Frame work - startApp();
	//startApp(); - executes testcasaes in chrome by default & headless.
	//startApp(); - executes crossBrowser testing & headless.
}
