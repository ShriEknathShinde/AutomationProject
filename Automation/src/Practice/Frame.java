package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shrik/OneDrive/Desktop/Page1.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("Q");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		driver.findElement(By.name("n2")).sendKeys("J");
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame(1);
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("S1")).sendKeys("P");
	    driver.switchTo().parentFrame();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("t1")).sendKeys("sp");
	    driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("n2")).sendKeys("sp");
	    driver.switchTo().parentFrame();
	    driver.switchTo().frame(1);	
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("S1")).sendKeys("ysp");
	    Thread.sleep(1000);
	    
	    driver.close();
	}

}
