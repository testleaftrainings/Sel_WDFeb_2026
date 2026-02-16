package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// Step 1 - Instantiate the browser driver

		ChromeDriver driver = new ChromeDriver();

		// window maximize
		driver.manage().window().maximize();

		// Step 2 - pass the endpoint of the website/application
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement dropDownelement = driver.findElement(By.className("ui-selectonemenu"));

		Select opt = new Select(dropDownelement);

		Thread.sleep(3000);

		opt.selectByVisibleText("Selenium");

		Thread.sleep(3000);
		
		opt.selectByIndex(3);
		
		//Non-Select dropdown
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		WebElement element = driver.findElement(By.xpath("//li[text()='Malayalam']"));
		element.click();

		// opt.selectByValue(null);
		
	}

}
