package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayedIsSelecedTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.123formbuilder.com/index.php?p=login&utm_term=header-login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		boolean b1= driver.findElement(By.name("username")).isDisplayed();
		System.out.println(b1);
		
		boolean b2= driver.findElement(By.xpath("//input[@id='checkbox-1-1']")).isSelected();
		System.out.println(b2);
		
		boolean b3= driver.findElement(By.id("submit-form-button")).isEnabled();
		System.out.println(b3);
		
	}

}
