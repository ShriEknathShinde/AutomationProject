package TestngPrograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerDesing.class)
public class Snake extends BaseClass{
	@Test
		public void rat() {
		Assert.fail();
		Reporter.log("Snake has swollen the rat",true);
	}
	
	@Test
	public void cat() {
	Assert.fail();
	Reporter.log("Snake has swollen the rat",true);
	
	}
}
