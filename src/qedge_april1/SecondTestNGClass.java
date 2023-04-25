package qedge_april1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SecondTestNGClass {
	WebDriver driver;
	@BeforeMethod
	public void Setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Running Precondotion",true);
	}
	@Test
	public void addition() 
	{
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("765432");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("7654");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Executing Addition test",true);
	}
	@Test
	public void division() 
	{
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("7864");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("567");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Execution Multiplication test",true);
	}
	@Test
	public void multiplication() 
	{
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("78900");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.xpath("(//input[@id='btn'])[1]")).sendKeys("9650");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Reporter.log("Execution Division test",true);
	}
	@AfterMethod
	public void tearDown() 
	{
		Reporter.log("Running Postcondition",true);
		driver.quit();
	}
}
