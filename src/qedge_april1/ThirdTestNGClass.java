package qedge_april1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ThirdTestNGClass {
	WebDriver driver;
	@BeforeSuite
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Reporter.log("Running Precondition",true);
	}
	@Test(priority=0)
	public void branches()
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executing the Branches Test",true);
	}
	@Test(priority=2)
	public void roles()
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Executing the Roles Test",true);
	}
	@Test(priority=1,invocationCount = 3)
	public void users()
	{
		driver.findElement(By.xpath("(//img)[7]")).click();
		Reporter.log("Executing the User Test",true);
	}
	@Test(enabled=false)
	public void employee()
	{
		driver.findElement(By.xpath("(//img)[8]")).click();
		Reporter.log("Executing the employee Test",true);
	}
	@AfterSuite
	public void Postcondition()
	{
		Reporter.log("Running PostCondition",true);
		driver.quit();
	}

}
