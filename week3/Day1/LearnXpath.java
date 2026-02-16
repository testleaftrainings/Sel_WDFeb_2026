package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnXpath {

	public static void main(String[] args) {

		// To handle chrome notifications
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver(opt);

		// window maximize
		driver.manage().window().maximize();

		// Step 2 - pass the endpoint of the website/application
		driver.get("http://leaftaps.com/opentaps/control/main");

		String title = driver.getTitle();
		System.out.println(title);

		String text = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText();

		System.out.println(text);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		String title2 = driver.getTitle();
		System.out.println(title2);

		// title "TestLeaf"
		// Leaftaps - TestLeaf Automation Platform
	}

}
