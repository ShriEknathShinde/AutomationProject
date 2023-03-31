package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	       }
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Thane");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("shri@210801");
		WebElement daydrop = driver.findElement(By.name("birthday_day"));
		Select s= new Select(daydrop);
		s.selectByIndex(20);
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(7);
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y=new Select(year);
		y.selectByValue("2001");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
