package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		// Implicitly wait - Global wait; appllies for evey line of code/element; ends
		// when driver session is closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2 - pass the endpoint of the website/application
		driver.get("https://www.leafground.com/frame.xhtml");
		
		// Exception - org.openqa.selenium.NoSuchElementException
		//Elemen is present inside a iframe
		//driver.findElement(By.id("Click")).click();
		
		//Switch the driver focus to iframe
		//index starts with 0
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
	}

}
