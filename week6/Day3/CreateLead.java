package week6.day3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends projectSpecificMethod {

	/*
	 * @DataProvider(name = "getValue") public String[][] fetchData() throws
	 * IOException { // |cName|fName|lName| // |TestLeaf|Hari|R| //
	 * |TestLeaf|srini|vasan| return ReadValueFromExcel.getValue(); }
	 */
	
	@BeforeClass
	public void setData() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "getValue")
	public void createLead(String cName, String fName, String lName) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();

	}
	
}
