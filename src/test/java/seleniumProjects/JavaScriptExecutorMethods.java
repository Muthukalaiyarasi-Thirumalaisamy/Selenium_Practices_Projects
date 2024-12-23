package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorMethods {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.findElement(By.id("email")).sendKeys("muthu");
		
		driver.findElement(By.id("pass")).sendKeys("muthu@123");
		WebElement LoginButton = driver.findElement(By.id("loginbutton"));
		
		
 // DrawBorder(LoginButton,driver);
 //ClickElement(driver,LoginButton);
 //Alert(driver,"This is alert");
//Refresh(driver);
//System.out.println(GetTitle(driver));
//System.out.println(GetInnertext(driver));
//GetInnertext(driver);
 // ScrollDown(driver);
  ScrollIntoView(LoginButton,driver);
		
	}
	
	public static void ScrollIntoView(WebElement element,WebDriver driver)
	{
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);",element);
	
	}
	
//	public static void ScrollDown(WebDriver driver)
//	{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//    js.executeScript("window.scroll(0,document.body.scrollHeight)");
//	
//	}
//	
//	public static String GetInnertext(WebDriver driver)
//	{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//		String title = js.executeScript("return document.documentElement.innerText;").toString();
//	return title;
//	
//	}
	
//	public static String GetTitle(WebDriver driver)
//	{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//	return title;
//	
//	}
	
//	public static void Refresh(WebDriver driver)
//	{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("history.go(0)");
//	
//	}
//	
//	public static void Alert(WebDriver driver, String msg)
//	{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("alert('"+msg+"')");
//	
//	}
	

//	
//	public static void ClickElement(WebDriver driver, WebElement element)
//{
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();",element);
//	
//	}
	
//	
//	public static void DrawBorder(WebElement element, WebDriver driver)
//	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].style.border= '3px solid red'",element);
//		
//		
//	}
	
	}


