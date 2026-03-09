package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveTo {

	public static void main(String[] args) {
		//
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		//Locate the element - //div[text()='Home & Kitchen']
		WebElement moveTo = driver.findElement(By.xpath("//div[text()='Home & Kitchen']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(moveTo).perform();
		
		//ScrollToElement
		WebElement scrollTo = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		
		act.scrollToElement(scrollTo).perform();
	}

}
