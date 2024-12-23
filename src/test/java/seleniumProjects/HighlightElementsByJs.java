package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementsByJs {

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
		
		
		flash(driver,LoginButton);
		
		
	}
	
	public static void flash(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String BgClr= element.getCssValue("BackgroundColor");
		for(int i=0;i<100;i++)
		{
			ChangeColor("rgb(0,200,0)",driver,element);
			
			ChangeColor(BgClr,driver,element);
		}
		
	}
	public static void ChangeColor(String color, WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor= '"+ color+"'",element);
		
		
	}
	

}
