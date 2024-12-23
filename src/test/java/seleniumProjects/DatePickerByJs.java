package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerByJs {

	public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "30-12-2017";
		
		selectDateByJS(driver, date, dateVal);
		
	}
	
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
	
		
	}


