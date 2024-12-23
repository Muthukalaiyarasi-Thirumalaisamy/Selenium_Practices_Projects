package seleniumProjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowPopUp {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("windowButton")));
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> handler= driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String first = it.next();
		
		System.out.println(first);
		
		String sec = it.next();
		
		System.out.println(sec);
		
		driver.switchTo().window(sec);
		
		System.out.println("new window:" + driver.getTitle());
		
		
driver.switchTo().window(first);
		
System.out.println(driver.getTitle());
		
		
		driver.close();
		driver.quit();
		
		
		
		
	}

}
