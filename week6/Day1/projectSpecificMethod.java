package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class projectSpecificMethod {

	//global
	ChromeDriver driver;
	
	
	// Step1: to declare the name & value in the .xml <parameter>
	// Step2: to declare the @Parameters annotation on top of the req. method & pass the key/name to the @Parameters
	
	@Parameters({"url", "userName", "passWord"})
	@BeforeMethod
	// Step3: pass the argumets to match the key/name in the @Paramaters
	public void preCondition(String url, String uName, String pWord ) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
