package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

public static void main(String[] args) {
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		OnClick(driver, driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")), Duration.ofSeconds(10));
		
	
}
public static void OnClick(WebDriver driver, WebElement element, Duration duration) {
	new WebDriverWait(driver,duration).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
	element.click();
}

}
