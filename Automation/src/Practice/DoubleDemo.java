package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleDemo {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement click = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click Me To See Alert\")]"));
	Actions ac = new Actions(driver);
	ac.doubleClick(click).perform();
	Thread.sleep(1000);
	Alert a = driver.switchTo().alert();
	a.accept();
	Thread.sleep(1000);
	driver.close();
}
}
