package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Step 1 - Instantiate the browser driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//window maximize
		driver.manage().window().maximize();
		
		//Step 2 - pass the endpoint of the website/application
		driver.get("https://www.facebook.com/");
		
		//To close.
		driver.close();
	}

}
