package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPgae {
	//declaration
@FindBy(id = "username")
private WebElement untbx ;

public WebElement getUntbx() {
	return untbx;
}

public WebElement getPwtbx() {
	return pwtbx;
}

public WebElement getLogin() {
	return login;
}

@FindBy(name = "pwd")
private WebElement pwtbx;

@FindBy(xpath = "//div[.='login ']")
private WebElement login;

//initialization
public LoginPgae(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//utilization

}
