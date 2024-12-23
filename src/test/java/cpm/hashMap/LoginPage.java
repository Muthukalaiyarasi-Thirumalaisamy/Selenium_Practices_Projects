package cpm.hashMap;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPage {

	public WebDriver driver;
	@Test
	public void Login() throws InterruptedException
	{
		
		
		driver= new ChromeDriver(); 
		driver.get("https://spiceclub.spicejet.com/signup");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        
        
       String creds = BaseData.GetUserData().get("user");
       String cred1[] = creds.split("_");
       //System.out.println(cred1[0]);
       
        
     Select select = new Select(driver.findElement(By.xpath("//select[@class='form-control form-select ']")));
     select.selectByVisibleText("Mr");
     
     Thread.sleep(2000);
     
     driver.findElement(By.id("first_name")).sendKeys(cred1[0]);
     
     Thread.sleep(2000);

     driver.findElement(By.id("new-password")).sendKeys(cred1[1]);
     Thread.sleep(2000);

     
     driver.findElement(By.id("c-password")).sendKeys(cred1[1]);
     Thread.sleep(2000);


	}
	

}
