package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/shrik/OneDrive/Desktop/Page1.html");
	Thread.sleep(3000);
	driver.findElement(By.id("t1")).sendKeys("Qsp");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	driver.findElement(By.name("n2")).sendKeys("Jsp");
	Thread.sleep(3000);
	driver.close();
	
}
}
