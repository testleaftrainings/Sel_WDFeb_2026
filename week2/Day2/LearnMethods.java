package week2.day2;

public class LearnMethods {

	// Create outside the main method
	// Access modifiers - Public, Private, Protected, Default

	public String method1(String name, int number) {
		System.out.println("Iam a public method");
		return name + number;
	}

	private void method2() {
		System.out.println("Iam a private method");
	}

	protected void method3() {
		System.out.println("Iam a protected method");

	}

	void method4() {
		System.out.println("Iam a default method");
	}

	public static void main(String[] args) {
		
		//creating an object
		LearnMethods object = new LearnMethods();
		String method1 = object.method1("Aswin ", 7);
		System.out.println(method1);
		object.method2();
		object.method3();
		object.method4();
		
		LearnMethods obj = new LearnMethods();
		obj.method2();
		
		
		
	}

}
