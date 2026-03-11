package week6.day3;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class projectSpecificMethod {

	// global
	RemoteWebDriver driver;
	
	//CI Step 1: Declare the fileName as Global
	String fileName;

	// Step1: to declare the name & value in the .xml <parameter>
	// Step2: to declare the @Parameters annotation on top of the req. method & pass
	// the key/name to the @Parameters

	@BeforeMethod
	// Step3: pass the argumets to match the key/name in the @Paramaters
	public void preCondition() throws InterruptedException {
		String browserName = "Chrome";

		switch (browserName) {
		case "Chrome":
			System.out.println("The current execusion is in Chrome");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			driver = new ChromeDriver(options);
			break;
		case "FireFox":
			System.out.println("The current execusion is in FireFox");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			System.out.println("The current execusion is in Edge");
			System.setProperty("webdriver.edge.driver", "./Driver/MicrosoftEdgeSetup.exe");
			driver = new EdgeDriver();

			break;
		case "Safari":
			System.out.println("The current execusion is in Safari");
			break;
		default:
			System.out.println("The current execusion is in IE");
			break;
		}

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name = "getValue")
	public String[][] fetchData() throws IOException {
		// |cName|fName|lName|
		// |TestLeaf|Hari|R|
		// |TestLeaf|srini|vasan|
		return ReadValueFromExcel.getValue(fileName);
	}
	
}
