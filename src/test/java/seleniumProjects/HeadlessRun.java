package seleniumProjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessRun {

	public static void main(String[] args) throws IOException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\MOMS'GIRL\\OneDrive\\Documents\\SELENEIUM_PROJECT\\seleniumProjects\\headlessimage.png"));
		
		
	}

}
