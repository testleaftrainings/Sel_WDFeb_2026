package week4.day1;

public class ExecutionClass extends RemoteDriver {

	@Override
	public void findElements() {
		System.out.println("findElements - From the ExecutionClass");
	}

	@Override
	void getCurrentUrl() {
		System.out.println("getCurrentUrl - From the ExecutionClass");

	}
	// class - class : extends
	// class - interface : implements
	// abstractClass - interface : implements
	// abstractClass - class : extends

	public static void main(String[] args) {
		ExecutionClass obj = new ExecutionClass();
		obj.findElement();
		obj.findElements();
		obj.getCurrentUrl();
		obj.getTitle();
		obj.quit();
		
		WebDriver.close();
	}
}
