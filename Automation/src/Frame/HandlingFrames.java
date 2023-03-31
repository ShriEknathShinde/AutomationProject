package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/shrik/OneDrive/Desktop/Page1.html");
	Thread.sleep(1000);
	driver.findElement(By.id("t1")).sendKeys("Qsp");
	driver.switchTo().frame(0);
	
	Thread.sleep(1000);
	driver.findElement(By.name("n2")).sendKeys("jsp");
	Thread.sleep(1000);
	driver.close();
	
}
}
