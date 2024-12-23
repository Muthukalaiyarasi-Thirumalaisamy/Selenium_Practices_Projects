package seleniumProjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadPropFile {

    static WebDriver driver;
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Properties prob = new Properties();
        FileInputStream ip = new FileInputStream("src/test/java/seleniumProjects/config.properties");
        prob.load(ip);    
    
        String url = prob.getProperty("webUrl");
        String browser = prob.getProperty("webBrowser");

        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            
            // Adjusting timeouts for better performance
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        
        // Uncomment the following line if you need to switch to a frame
        // driver.switchTo().frame(0);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(prob.getProperty("checkinXpath")))));

        driver.findElement(By.xpath(prob.getProperty("checkinXpath"))).click();
    }
}