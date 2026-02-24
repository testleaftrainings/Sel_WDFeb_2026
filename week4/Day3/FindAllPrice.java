package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllPrice {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// window maximize
		driver.manage().window().maximize();
		// Implicitly wait - Global wait; appllies for evey line of code/element; ends
		// when driver session is closed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 2 - pass the endpoint of the website/application
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

		List<WebElement> elements = driver.findElements(By.className("a-price-whole"));

		//**Create an empty list**
		List<Integer> listPrice = new ArrayList<Integer>();
		for (int i = 0; i < elements.size(); i++) {
			String price = elements.get(i).getText();
			// System.out.println(price);

			if (!price.isEmpty()) {
				String replaceAll = price.replaceAll(",", "");

				int int1 = Integer.parseInt(replaceAll);
				System.out.println(int1);
				//**Store the int1 value to listPrice using add** 
				listPrice.add(int1);
			}
			//**To sort in order**
			Collections.sort(listPrice);
			System.out.println(listPrice);
			
			//**To remove duplicates**
			Set<Integer> unique = new TreeSet<Integer>(listPrice);
			System.out.println(unique);
		}
	}

}
