//write a script to do compare by using softAsset
package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertProgrME {
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
	SoftAssert s = new SoftAssert();
	s.assertEquals(expectedtitle, actualtitle);
	
	driver.close();
	s.assertAll();

}
}
