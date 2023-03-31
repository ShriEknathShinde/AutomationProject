package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3Frames {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}public static void main(String[] args) throws InterruptedException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/shrik/OneDrive/Desktop/Page1.html");
	Thread.sleep(1000);
	driver.findElement(By.id("t1")).sendKeys("Q");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	driver.findElement(By.name("n2")).sendKeys("J");
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	driver.findElement(By.id("S1")).sendKeys("P");
	Thread.sleep(1000);
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("SP");
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	driver.findElement(By.name("n2")).sendKeys("SP");
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	Thread.sleep(1000);
	driver.findElement(By.id("S1")).sendKeys("YSP");
	Thread.sleep(1000);
	driver.close();
	}
}
