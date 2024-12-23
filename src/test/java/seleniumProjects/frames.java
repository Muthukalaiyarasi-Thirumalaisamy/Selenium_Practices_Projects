package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		
		Thread.sleep(30);
		
		driver.findElement(By.xpath("//div[contains(text(),'Extra Seat')]")).click();
	}

}
