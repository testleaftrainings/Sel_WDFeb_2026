package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearnDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  -- 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//Locate the Element to be Draged - Source
		WebElement source = driver.findElement(By.id("form:drag"));
		
		//Locate the Element to be Dropped - Target
		WebElement target = driver.findElement(By.id("form:drop"));

		//Actions Class -- perform
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		

	}

}
