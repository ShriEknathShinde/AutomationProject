package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(1000);
	WebElement day= driver.findElement(By.id("day"));
	Select s= new Select(day);
	s.selectByIndex(20);
	Thread.sleep(1000);
	
	WebElement month = driver.findElement(By.id("month"));
	Select m = new Select(month);
	m.selectByIndex(7);
	Thread.sleep(1000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select y = new Select(year);
	y.selectByValue("2001");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	Thread.sleep(1000);
	
	driver.close();
	
	
}
}
