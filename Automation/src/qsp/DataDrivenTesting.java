//write a script to do create a customer in Actitime app
package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DataDrivenTesting {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		Properties p= new Properties();
		p.load(fis);
		String URl = p.getProperty("url");
		driver.get(URl);
		String UN = p.getProperty("username");
		driver.findElement(By.name("username")).sendKeys(UN);
		String PW = p.getProperty("password");
		driver.findElement(By.name("pwd")).sendKeys(PW);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
		FileInputStream fis1 = new FileInputStream("./Testdata/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String name = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter Customer Name\"])[2]")).sendKeys(name);
		String desc = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys(desc);
		
		driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
