package week5.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//ContextClick - RightClick
		WebElement contextClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//Actions -- class
		Actions act = new Actions(driver);
		act.contextClick(contextClick).perform();
		
	}

}
