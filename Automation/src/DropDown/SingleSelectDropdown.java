package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("firstname")).sendKeys("Shrikant");
	driver.findElement(By.name("lastname")).sendKeys("Chincholkar");
	driver.findElement(By.name("reg_email__")).sendKeys("8888607660");
	driver.findElement(By.name("reg_passwd__")).sendKeys("shri@210801");
	Thread.sleep(1000);
	WebElement daydrop = driver.findElement(By.id("day"));
	Select s= new Select(daydrop);
	s.selectByIndex(20);
	Thread.sleep(1000);
	
	WebElement monthdrop = driver.findElement(By.id("month"));
	Select m = new Select(monthdrop);
	m.selectByIndex(7);
	Thread.sleep(1000);
	
	WebElement yeardrop = driver.findElement(By.id("year"));
	Select y = new Select(yeardrop);
	y.selectByValue("2001");
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	Thread.sleep(1000);
	
	driver.close();
	
	
}
}
