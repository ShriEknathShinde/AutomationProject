package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
    WebElement src = driver.findElement(By.partialLinkText("Resources"));
    Actions ac = new Actions(driver);
    ac.moveToElement(src).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String mobile = driver.findElement(By.xpath("//p[contains (text(),'+91 9243602352')]")).getText();
	System.out.println(mobile);
	
	driver.close();
	
	
}
}

