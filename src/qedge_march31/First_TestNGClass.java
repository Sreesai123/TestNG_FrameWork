package qedge_march31;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
public class First_TestNGClass {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Running Precondition",true);
	}
	@Test
	public void CBanking() {
		driver.findElement(By.xpath("(//img)[5]")).click();
		Reporter.log("Executing CBanking",true);
	}
	@Test
	public void PBanking() {
		driver.findElement(By.xpath("(//img[position()=1])[4]")).click();
		Reporter.log("Executing CBanking");
	}@Test
	public void IBanking() {
		driver.findElement(By.xpath("(//img)[6]")).click();
		Reporter.log("Executing CBanking",true);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		Reporter.log("Running Post Condition",true);
	}

}
