package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node01rgbz3av1gpkz19r3i6oakrda813293994.node0");

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//WebElement element = driver.findElement(By.id("j_idt87:j_idt90"));
		
		
	
		// element.getText();
		// System.out.println(element);
		
		//Using the Explicit wait
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
		String text = until.getText();
		System.out.println(text);
	}

}
