package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://www.bbc.com/");
	    JavascriptExecutor j = (JavascriptExecutor) driver;
	    j.executeScript("window.scrollBy(0,3000)");
	    Thread.sleep(2000);
	    driver.close();
	}
}
