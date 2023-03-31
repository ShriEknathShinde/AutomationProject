package TestngPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DeleteCustomer {
	@Test(priority = 2)
	public void Dhoni() {
		Reporter.log("best captain ever in history",true);
	}
	@Test(priority = 1)
	public void Sehwag() {
		Reporter.log("dangerous opener",true);
	}
	@Test(enabled = false)
	public void Ashwin() {
		Reporter.log("offspinner mankading",true);
	}
}
