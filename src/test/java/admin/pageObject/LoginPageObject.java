package admin.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonFunctions.BaseClass;

public class LoginPageObject extends BaseClass{
	
	public WebDriver  driver; 
	
	@FindBy(id = "mat-input-0")
	WebElement ContactNo; 
	@FindBy (id = "mat-input-1")
	WebElement Password; 
	@FindBy (tagName = "button")
	WebElement  LoginButton;
	@FindBy (css =  "a.secondary-text")
	WebElement ForgetPassword;

	
	public void UserLogin(String UserNo, String Passward ) {
		ContactNo.sendKeys(UserNo);
		Password.sendKeys(Passward);
		sleep(5);
		LoginButton.submit();
		sleep(5);
	}
	public void ClickOnForgetPassword()
	{
		sleep(4);
		ForgetPassword.click();	
	}
	


}
