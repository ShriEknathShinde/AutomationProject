package TestngPrograms;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("database connected",true);
	}
	@AfterSuite
	public void databaseDisconnected() {
		Reporter.log("database disconnected",true);
		
	}
	@BeforeTest
	public void launchBrouser() {
		Reporter.log("browser launc",true);
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("browser closed",true);
	}
		
	@BeforeMethod
    public void login() {
		Reporter.log("lagged in succesfully",true);		
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logged out",true);
	}
	
	@Test
	public void createCustomer() {
		Reporter.log("customer created",true);
   } 
}
