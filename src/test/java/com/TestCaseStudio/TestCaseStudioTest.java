package com.TestCaseStudio;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCaseStudioTest {

    @Test
    public void TestCaseRun() throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");
        co.addExtensions(new File("C:\\Users\\MOMS'GIRL\\Downloads\\LOOPJJEGNLCCNHGFEHEKECPANPMIELCJ_1_7_8_0.crx"));

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(co);
        
        //document.title - if you type this in test case studio you will get the url of it
        
        driver.get("chrome-extension://loopjjegnlccnhgfehekecpanpmielcj/testCaseStudio/studioWindow.html");
        
        String id= driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.spicejet.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Login')]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']"))).sendKeys("6364573845");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("muthu@123");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'LOGIN')]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginButton);

        Thread.sleep(3000); 
        
        driver.switchTo().window(id);
        
        System.out.println(driver.getTitle());
        
        Thread.sleep(3000); 

        
        driver.findElement(By.xpath("//input[@title='Edit test case name']")).sendKeys("TestCaseStuio Testcases");
        
        Thread.sleep(3000); 

        driver.findElement(By.id("save_btn")).click();
        
        Thread.sleep(3000); 

        //driver.quit();
    }
}