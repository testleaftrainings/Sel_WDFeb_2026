package week4.day1;

public class RemoteWebDriver implements WebDriver {
	
	//class - class : extends
	//class - interface : implements

	@Override
	public void findElement() {
		System.out.println("findElement - From the WebDriver(Interface)");
	}

	@Override
	public void findElements() {
		System.out.println("findElements - From the WebDriver(Interface)");
	}

	public static void main(String[] args) {
		// Cannot instantiate the type WebDriver
		//WebDriver obj = new WebDriver();
		
		RemoteWebDriver obj = new RemoteWebDriver();
		
		obj.quit();
		obj.findElement();
		obj.findElements();
		//obj.close(); can't call static methods through object
		WebDriver.close(); //static methods we can call using directly with Interface name
		
		
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
