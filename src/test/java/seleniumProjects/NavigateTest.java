package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		driver.navigate().to("https://www.youtube.com/watch?v=rIFnN15nSJU&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=11");
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());

		
		driver.quit();
		

	}

}
