package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException   {
	//Step 1 - Instantiate the browser driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//window maximize
		driver.manage().window().maximize();
		
		//Implicitly wait - Global wait; appllies for evey line of code/element; ends when driver session is closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Step 2 - pass the endpoint of the website/application
		driver.get("https://www.facebook.com/");
		
		//Locate the element
		driver.findElement(By.name("email")).sendKeys("username");//pass
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("pass")).sendKeys("password");//login
		
		driver.findElement(By.name("login")).click();//login
		
		//driver.close();


		
	}

}
