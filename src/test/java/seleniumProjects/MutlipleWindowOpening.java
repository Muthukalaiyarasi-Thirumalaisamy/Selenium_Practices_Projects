package seleniumProjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleWindowOpening {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
	
		String web1= driver.getWindowHandle();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.open('https://www.google.com', '_blank');");
		
		Set<String> web2= driver.getWindowHandles();
		
		System.out.println(web1);
		System.out.println(web2);

		
	}

}
