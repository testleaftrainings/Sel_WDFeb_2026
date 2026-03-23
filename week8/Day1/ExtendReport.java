package week8.day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {
	public static void main(String[] args) {

		// STEP 1: To set the path
		ExtentHtmlReporter wb = new ExtentHtmlReporter("./report/loginReport.html");

		// STEP 2:
		ExtentReports repo = new ExtentReports();

		// STEP 3:
		repo.attachReporter(wb);

		// STEP 5:
		ExtentTest test = repo.createTest("LoginPage", "LeafTaps");
		test.pass("Enter the Valid userName");
		test.pass("Enter the InValid passWord");
		test.pass("Click on Login Button");
		test.fail("Click on Logout");
		repo.flush();

	}
}
