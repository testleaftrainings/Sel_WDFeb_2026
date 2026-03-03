package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		// Implicitly wait - Global wait; appllies for evey line of code/element; ends
		// when driver session is closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2 - pass the endpoint of the website/application
		driver.get("https://www.leafground.com/alert.xhtml");

		// Click on simple model alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();

		// driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		// Switch the driver focus to Alret
		Alert alert1 = driver.switchTo().alert();

		// To get the text from the alert box
		String alertText = alert1.getText();
		System.out.println("Text from Model - Simple alet : " + alertText);
		Thread.sleep(2000);

		// Accept the alert
		alert1.accept();

		// Exceptions in alert - org.openqa.selenium.UnhandledAlertException

		// Click on Confirmation model alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();

		Alert alert2 = driver.switchTo().alert();

		String alert2text = alert2.getText();
		System.out.println("Text from Model - Confirmation model alert : " + alert2text);

		alert2.dismiss();
		Thread.sleep(2000);
		// Click on Model alert - Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		// String var = ;

		alert3.sendKeys("VIGNESH P");

		alert3.accept();

		// Click on Non Model alert - Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

	}

}
