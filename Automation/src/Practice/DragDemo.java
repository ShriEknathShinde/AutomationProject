package Practice;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        WebElement src = driver.findElement(By.xpath("//h1[.='Block 1']"));
        WebElement dest = driver.findElement(By.xpath("//h1[.='Block 4']"));
        Thread.sleep(3000);
	    Actions ac =new Actions(driver);
	    ac.dragAndDrop(src, dest).perform();
	    driver.close();
	}
	
}