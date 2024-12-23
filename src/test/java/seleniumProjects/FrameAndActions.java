package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameAndActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668803176719&utm_campaign=Search-Brand-APAC-Navigational&utm_campaigncode=Core%209182595&utm_term=e%20browserstack");
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Developers']"))).build().perform();
		
		driver.findElement(By.linkText("Documentation")).click();
	}

}
