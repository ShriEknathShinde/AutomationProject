package MouseActions;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	Thread.sleep(2000);
	WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
	WebElement b2 = driver.findElement (By.xpath("//h1[.='Block 4']"));
	Actions ac = new Actions(driver);
	ac.dragAndDrop(b1, b2).perform();
	Thread.sleep(5000);
	driver.close();
	}
	}