package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomUtilization {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void loginToActitime() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	LoginPgae lp=new LoginPgae(driver);
	lp.getUntbx().sendKeys("admin");
	lp.getUntbx().sendKeys("manager");
	lp.getLogin().click();
	
}
}
