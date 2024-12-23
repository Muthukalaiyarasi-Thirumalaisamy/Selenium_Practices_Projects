package seleniumProjects;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.python.core.exceptions;

public class FluentWaits {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();

driver.get("https://get.jenkins.io/windows-stable/2.479.2/jenkins.msi");
String path = "Downloads";
String filename = "jenkins.msi";
File file = new File(path, filename);

FluentWait<File> wait= new FluentWait<File>(file).withTimeout(Duration.ofMinutes(4)).pollingEvery(Duration.ofMillis(5)).ignoring(Exception.class);

Boolean ifDone =wait.until(f -> f.exists() && f.canRead());
if(ifDone)
{
System.out.println("file is downloaded");
	}
else
{
	System.out.println("file is not downloaded");

}

}
}
