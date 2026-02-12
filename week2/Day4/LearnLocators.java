package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) throws InterruptedException {
	//Step 1 - Instantiate the browser driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//window maximize
		driver.manage().window().maximize();
		
		//Step 2 - pass the endpoint of the website/application
		driver.get("https://www.facebook.com/");
		
		//Locate the element
		driver.findElement(By.id("email")).sendKeys("username");//pass
		
		driver.findElement(By.id("pass")).sendKeys("password");//login
		
		driver.findElement(By.name("login")).click();//login
		
		Thread.sleep(3000);
		
		driver.close();


		
	}

}
