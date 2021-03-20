package admin.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonFunctions.BaseClass;

public class ForgetPasswordPageObject extends BaseClass{
	
	
	@FindBy(id = "mat-input-2")
	WebElement ContactNo; 
	@FindBy(xpath = "//span[contains(text(),'SEND NEW PASSWORD')]")
	WebElement SendNewPasswordButton; 
	@FindBy(linkText = "Go back to login")
	WebElement GoToBackLoginPage; 
	
	public void ForgetPassword (String UserNo) {
		ContactNo.sendKeys(UserNo);
		sleep(5);
		SendNewPasswordButton.click();		
	}
	public void GotoBacklinkPage() {
		sleep(2);
		GoToBackLoginPage.click();
	}
	

}
