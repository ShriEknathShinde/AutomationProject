//write a script to do compare Expected and Actual Title by using java if else statement
package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Comapre {
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
	if (expectedtitle.equals(actualtitle)) {
		System.out.println("title is matching");
		
	} else {	
		System.out.println("title is not matching");

	}
driver.close();	
}
}
