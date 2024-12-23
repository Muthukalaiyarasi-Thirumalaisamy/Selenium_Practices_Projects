package seleniumProjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
       WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of whole linkList:" +linkList.size());
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0;i<linkList.size();i++)
		{	
			 @SuppressWarnings("deprecation")
			String href = linkList.get(i).getAttribute("href");
	            if (href != null && !href.isEmpty()) {
	                activeLinks.add(linkList.get(i));
	            }	
				
		}
		System.out.println("size of active linkList:" +activeLinks.size());

		for(int j=0;j<activeLinks.size();j++)
		{
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			System.out.println(activeLinks.get(j).getAttribute("href")+"----"+response);
			
		}
	}

}
