package TakeScreenshotonFailedTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
public static WebDriver driver;

	public void intialise()
	{
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	}
	
	public void failed(String MethodName)
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\MOMS'GIRL\\OneDrive\\Documents\\SELENEIUM_PROJECT\\seleniumProjects\\Screenshots\\"+MethodName+"_"+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		
	}
}


