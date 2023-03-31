package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws Throwable {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.findElement(By.name("search_query")).sendKeys("sikandar sheikh kusti chincholi");
	driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
	Thread.sleep(5000);
	driver.close();
}
}