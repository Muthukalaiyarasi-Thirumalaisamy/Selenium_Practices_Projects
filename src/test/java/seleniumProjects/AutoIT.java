package seleniumProjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://tinypic.host/?lang=en");
		driver.findElement(By.xpath("//span[text()='Start uploading']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\MOMS'GIRL\\OneDrive\\Documents\\SELENEIUM_PROJECT\\FileuploadExecution.exe");
		
		Thread.sleep(2000);
	}

}
