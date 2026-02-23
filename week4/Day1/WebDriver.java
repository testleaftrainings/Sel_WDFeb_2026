package week4.day1;

public interface WebDriver {

	// till java 1.7 it is 100% Abstraction
	void findElement();

	void findElements();

	// two types of implimentation methods - static, default
	//above 1.7 or from 1.8 it works
	
	default void quit() {
		System.out.println("default method - quit");
	}

	static void close() {
		System.out.println("static method - close");
	}
	
	void getTitle();

//	public static void main(String[] args) {
//		
//		//Cannot instantiate the type WebDriver
//		WebDriver obj = new WebDriver();
//	}
}
