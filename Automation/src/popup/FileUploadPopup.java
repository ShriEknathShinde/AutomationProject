package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shrik/OneDrive/Desktop/rozgar.html");
		Thread.sleep(3000);
		driver.findElement(By.id("h1")).sendKeys("C:\\Users\\shrik\\OneDrive\\Desktop\\Java Programmes\\Automation\\Testdata\\Shri.pdf.docx");
		Thread.sleep(3000);
		driver.close();
	}

}
