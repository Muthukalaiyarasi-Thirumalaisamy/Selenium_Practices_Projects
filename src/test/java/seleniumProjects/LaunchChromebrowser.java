package seleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromebrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\MOMS'GIRL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		//System.out.println(title);
		
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("test is passed");
		
		}
		else
		{
			System.out.println("test is failed");
		}
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());

	
driver.quit();
}
}