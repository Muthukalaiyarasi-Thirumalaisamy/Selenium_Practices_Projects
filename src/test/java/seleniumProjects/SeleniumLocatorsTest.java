package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLocatorsTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
driver.get("https://www.tutorialspoint.com/market/signup.jsp?v=1.0");
driver.findElement(By.xpath("//input[contains(@id,\"firstName\")]")).sendKeys("Kalai");

driver.findElement(By.xpath("//input[contains(@id,\"lastName\")]")).sendKeys("muthu");


driver.findElement(By.id("email")).sendKeys("muthukalai2018@gmail.com");

Select select= new Select(driver.findElement(By.id("country_code")));
select.selectByVisibleText("Oman (+968)");

driver.findElement(By.id("phone")).sendKeys("6369236548");


WebElement checkbox = driver.findElement(By.id("chkPromotionalEmail"));
if(checkbox.isSelected())
{
checkbox.click();
}

driver.findElement(By.id("nextBtn")).click();
Thread.sleep(2000);
//driver.quit();
}

}
