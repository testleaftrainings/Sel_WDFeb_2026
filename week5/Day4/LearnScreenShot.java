package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");

		// Locate the inputField
	WebElement keysAction = driver.findElement(By.id("search-box-input"));

		keysAction.sendKeys("Books");

		// To get the Screenshot
		File screenshotAs = keysAction.getScreenshotAs(OutputType.FILE);

		File target = new File("./data/Snap.png");

		FileUtils.copyFile(screenshotAs, target);

	}

}
