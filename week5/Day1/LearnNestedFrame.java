package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		// Implicitly wait - Global wait; appllies for evey line of code/element; ends
		// when driver session is closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2 - pass the endpoint of the website/application
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//Switch to the parentFrame
		driver.switchTo().frame(2);
		
		//org.openqa.selenium.NoSuchElementException
		//driver.findElement(By.id("Click")).click();
		
		//Switch to the nestedFrame
		driver.switchTo().frame("frame2");
		
		//Click on button - nestedFrame
		driver.findElement(By.id("Click")).click();
		
		//Switching back to the parentFrame
		driver.switchTo().parentFrame();
		
		//Switching back to the defaultContent
		driver.switchTo().defaultContent();
		
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
