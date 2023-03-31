package MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions m = new Actions(driver);
		m.doubleClick(element).perform();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();
	}
}
