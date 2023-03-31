package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightDemo {
static {
	System.setProperty("webdriver.chrome.drivr","./driver/chromedriver.exe");
}
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");
	WebElement element = driver.findElement(By.linkText("actiTIME Inc."));
	Actions ac =new Actions(driver);
	ac.contextClick(element).perform();
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_T);
	driver.quit();
	}
}