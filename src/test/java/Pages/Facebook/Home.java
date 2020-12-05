package Pages.Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
public WebDriver driver;
@FindBy(name = "email")
WebElement emailField;
@FindBy(name = "pass")
WebElement passwordField;
@FindBy(name="login")
WebElement loginButton;
@FindBy(name = "forgotPasswordField" )
WebElement forgotPasswordButton;
public Home(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void enterEmailandPassword() {
	emailField.sendKeys("beenii12@yahoo.com");
}


public void passwordField() {
	passwordField.sendKeys("beenish");
}

public void Signingin() {
	loginButton.click();
	
}

public void clickForgotPasswordButton() {
	forgotPasswordButton.click();
}
public void emailField() {
	// TODO Auto-generated method stub
	
}
public void loginButton() {
	// TODO Auto-generated method stub
	
}

}





