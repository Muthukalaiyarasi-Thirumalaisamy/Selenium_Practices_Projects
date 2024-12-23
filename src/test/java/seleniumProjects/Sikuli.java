package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuli {

	public static void main(String[] args) throws SikuliException, Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=23");

		
		Screen s= new Screen();
		Pattern pause= new Pattern("pausee.png");
		s.wait(pause,10000);
		s.click();
		//s.click();
		
		Pattern mute= new Pattern("mike.png");
		s.wait(mute,2000);
		s.click();
		//s.click();
	}

}
