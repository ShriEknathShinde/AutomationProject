package qsp;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws Throwable {
	
FileInputStream fis= new  FileInputStream("./Testdata/commondata.property");
Properties p=new Properties();
p.load(fis);
String value = p.getProperty("url");
System.out.println(value);
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(option);
driver.get(value);
}
}