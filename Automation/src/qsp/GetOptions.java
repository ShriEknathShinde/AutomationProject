package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/shrik/OneDrive/Desktop/Qspider%20Bar.html");
		WebElement menu = driver.findElement(By.id("hotel menu"));
Select s=new Select(menu);
 String option = s.getWrappedElement().getText();
 System.out.println(option);
 driver.close();
 













	}

}
