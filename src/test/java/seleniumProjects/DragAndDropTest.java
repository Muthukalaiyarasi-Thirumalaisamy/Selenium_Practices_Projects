package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {

		
		
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
driver.switchTo().frame(0);
		
		Actions action= new Actions(driver);
		Thread.sleep(20);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();

	}

}
