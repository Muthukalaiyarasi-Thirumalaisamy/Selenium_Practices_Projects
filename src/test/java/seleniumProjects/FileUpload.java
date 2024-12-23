package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://html.com/input-type-file/");
driver.findElement(By.xpath("//input[@name=\"fileupload\"]")).sendKeys("C:\\Users\\MOMS'GIRL\\Downloads\\CASE.jpg");

	}

}
