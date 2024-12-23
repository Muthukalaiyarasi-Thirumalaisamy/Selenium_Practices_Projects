package TestNgSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgAnnotationsTest {
static WebDriver driver;
	
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("Testing is started");
	
	}
	
	@BeforeTest
	public void startTest()
	{
		System.out.println("before test");
	
	}
	
	@AfterTest
	public void endTest()
	{
		System.out.println("after test");
	
	}
	
	@BeforeClass
	public void startClass()
	{
		System.out.println("before class");
	
	}
	
	@AfterClass
	public void endClass()
	{
		System.out.println("after class");
	
	}
	
	@BeforeMethod
	public void startMethod()
	{
		System.out.println("start method");
	
	}
	@AfterMethod
	public void endMethod()
	{
		System.out.println("after method");
	
	}
	
	
	@Test(priority=2)
	@Parameters({"url","email"})
	public void testingOne(String url, String email)
	{
 driver= new ChromeDriver();
driver.get(url);
driver.findElement(By.id("login-username")).clear();
driver.findElement(By.id("login-username")).sendKeys(email);

}
	@Test(priority=1,groups="TestNgSampleTest")
	public void testingTwo()
	{
		System.out.println("test2 is done");
	}
	
	@Test(priority=3,groups="TestNgSampleTest")
	public void testingThree()
	{
		System.out.println("test3 is done");
	}
	
  @AfterSuite
	
	public void CloseTest()
	{
		System.out.println("Testing is completed");
	driver.quit();
	}
	
	
}
