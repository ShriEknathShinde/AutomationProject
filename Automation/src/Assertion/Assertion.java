//write a scrpit to do Hard assert
package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void compare() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	String expectedtitle = "Soogle";
	String actualtitle = driver.getTitle();
	Assert.assertEquals(expectedtitle, actualtitle);
	
	driver.close();
}
}
