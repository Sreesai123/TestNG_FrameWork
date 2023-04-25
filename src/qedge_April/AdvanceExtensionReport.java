package qedge_April;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class AdvanceExtensionReport {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void generateReport()
	{
		report = new ExtentReports("./Reports/Demo.html/");
	}
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	@Test
	public void testpass()
	{
		test = report.startTest("Test Pass");
		test.assignAuthor("Sreekanth");
		test.assignCategory("Functional");
		String expected ="Google";
		String actual = driver.getTitle();
		if (actual.equalsIgnoreCase(expected)) 
		{
			test.log(LogStatus.PASS,"Title is Matching::"+expected+"   "+actual);
		} 
		else 
		{
			test.log(LogStatus.FAIL,"Title is Matching::"+expected+"   "+actual);	
		}
	}
	@Test
	public void testfail()
	{
		test = report.startTest("Test fail");
		test.assignAuthor("Sreekanth");
		test.assignCategory("Functional");
		String expected ="gmail";
		String actual = driver.getTitle();
		if (actual.equalsIgnoreCase(expected)) 
		{
			test.log(LogStatus.PASS,"Title is Matching::"+expected+"   "+actual);
		} 
		else 
		{
			test.log(LogStatus.FAIL,"Title is Matching::"+expected+"   "+actual);	
		}
	}
	@AfterMethod
	public void tearDown()
	{
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}