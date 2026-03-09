package week5.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0vkta3oqhspd6ick42k2o592d13336232.node0");
		// to find the first data in the webTable
		String firstData = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("First data in the webTable " + firstData);
		// to print 4th row & 3rd column in the webTable
		String randomData = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[4]/td[3]"))
				.getText();
		System.out.println("6th row & 5th column in the webTable " + randomData);
		// printing the 3rd row data
		String thirdRow = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]"))
				.getText();
		System.out.println(thirdRow);
		String SecondRow = driver
				.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td")).getText();
		System.out.println("SecondRow " + SecondRow);
		List<WebElement> rowElements = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));

		List<WebElement> columnElements = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));
		// Nested ForLoop
		for (int i = 1; i <= rowElements.size(); i++) {
			System.out.print("|");
			for (int j = 1; j <= columnElements.size(); j++) {

				String data = driver.findElement(By.xpath(
						"//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[" + i + " ]/td[ " + j + " ]"))
						.getText();
				System.out.print(data +"|");
			}
			System.out.println();
		}
	}

}
