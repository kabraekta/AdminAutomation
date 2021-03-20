package admin.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonFunctions.BaseClass;

public class ConfigurationPageObject extends BaseClass{
	
	

	int x = 0, y = 600; 
	
	    @FindBy(id="mat-input-2")
		WebElement FirstName; 
		@FindBy(id="mat-input-3")
	    WebElement LastName; 
		@FindBy (id="mat-input-4")
		WebElement email; 
		@FindBy (id="mat-input-5")
		WebElement CurrentPassword; 
		@FindBy (id="mat-input-6")
		WebElement NewPassword; 
		@FindBy (id="mat-input-7")
		WebElement ConfirmPassword; 
		@FindBy (id="mat-checkbox-1")
		WebElement CheckBox; 
		@FindBy(xpath = "//span[contains(text(),'Upload')]")
		WebElement UpdateButton; 
		@FindBy(xpath = "//span[contains(text(),'Submit')]")
		WebElement SubmitButton; 
		 
		public void updateProfile(String sFirstName, String sLastName, String sEmail, String sCurrentPassword, String sNewPassword) {
			
			FirstName.clear();
			FirstName.sendKeys(sFirstName);
			sleep(2);
			LastName.clear();
			LastName.sendKeys(sLastName);
			sleep(2);
			email.clear();
			email.sendKeys(sEmail);
			sleep(2);
			CheckBox.click();
			CurrentPassword.clear();
			CurrentPassword.sendKeys(sCurrentPassword);
			sleep(2);
			NewPassword.sendKeys(sNewPassword);
			sleep(3);
		    NewPassword.sendKeys(Keys.TAB);
			sleep(5);
			ConfirmPassword.sendKeys(sNewPassword);
			sleep(5);
			SubmitButton.click();
	
		} 
		
		 


}
