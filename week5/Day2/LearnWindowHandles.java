package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		//
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01rgbz3av1gpkz19r3i6oakrda813293994.node0");

		// to print the current window id
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		// Click on Open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// Parent window
		String title = driver.getTitle();
		System.out.println(title);

		// switching to child window
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(childWindow);
		
		// Parent window
		//String title2 = driver.getTitle();
		//System.out.println(title2);
		
		//convert set to list
		List<String> currentlyActiveWindows = new ArrayList<String>(childWindow);
		
		//Switching between the windows 
		driver.switchTo().window(currentlyActiveWindows.get(1));
		
		//ChildWindow
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.findElement(By.id("email")).sendKeys("switched to child window");
	
		//ChildWindow
		driver.close();
		
		Thread.sleep(2000);
		//Printing the current child window - org.openqa.selenium.NoSuchWindowException
				//String title3 = driver.getTitle();
				//System.out.println(title3);
		
		//Switching  back to parent window
		driver.switchTo().window(currentlyActiveWindows.get(0));
		
		driver.close();

	}

}
