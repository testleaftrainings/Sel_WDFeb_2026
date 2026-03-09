package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		//Switch the driver focus to the iframe
		driver.switchTo().frame("iframeResult");
		
		WebElement dc = driver.findElement
		(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(dc).perform();
		
	}

}
