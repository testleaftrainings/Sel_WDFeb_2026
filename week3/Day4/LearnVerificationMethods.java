package week3.day3;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationMethods {

	public static void main(String[] args) {
		//Verification 
		//getText();
		//isEnabled();
		//getDomAttribute();
		//isDisplayed();
		
		ChromeDriver driver = new ChromeDriver();

		// window maximize
		driver.manage().window().maximize();

		// Step 2 - pass the endpoint of the website/application
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify your title
		if (title.contains("Platform")) {
			System.out.println("It contains the value - 'Platform'");
		} else {
			System.out.println("It doesn't contains the value - 'Platform'");
		}
//		
		//current url();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//getDomAttribute
		@Nullable
		//String attribute = driver.findElement(By.id("username")).getAttribute("class");
		String attribute = driver.findElement(By.id("username")).getDomAttribute("type");
		System.out.println(attribute);
		
		//isEnabled
		boolean displayed = driver.findElement(By.id("username")).isDisplayed();
		System.out.println(displayed);
		
		boolean displayed2 = driver.findElement(By.id("logout")).isDisplayed();
		System.out.println(displayed2);
		
	}

}
