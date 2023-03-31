package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.vtiger.com/");
	WebElement element = driver.findElement(By.partialLinkText("Resources"));
	Actions ac=new Actions(driver);
	ac.moveToElement(element).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String mobileno = driver.findElement(By.xpath("//p[contains(text(),'+44 20 3608 3666')]")).getText();
	System.out.println(mobileno);
	driver.close();
	}
}