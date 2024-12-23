package seleniumProjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       WebDriver driver = new ChromeDriver();
		
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
Alert alert = driver.switchTo().alert();
//alert.accept();
alert.dismiss();


}

}
