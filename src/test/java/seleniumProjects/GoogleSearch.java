package seleniumProjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("http://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println("total number of suggestions in search box:::===>" + list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial")){
				list.get(i).click();
				break;
			}
			
		}
		
		
	}

}
