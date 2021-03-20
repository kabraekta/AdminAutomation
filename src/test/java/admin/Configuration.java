package admin;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.BaseClass;
import admin.pageObject.ConfigurationPageObject;
import admin.pageObject.LoginPageObject;

public class Configuration extends BaseClass{
 
@Test (dataProvider = "getdata")
  public void testcaseUpdateProfilesection(String UserNo,String Password, String sMainMenuItem, String sSubMenuItem, String sFirstName, String sLastName,String sEmail, String sCurrentPassword, String sNewPassword) throws IOException {
	  LaunchandMaxmize();
	  LoginPageObject loginPage = PageFactory.initElements(driver, LoginPageObject.class); 
	  loginPage.UserLogin(UserNo, Password);
	  ClickMainMenuItem(sMainMenuItem);
	  sleep(5);
	  ClickSubMenuItem(sSubMenuItem); 
	  ConfigurationPageObject ConfiPage = PageFactory.initElements(driver,ConfigurationPageObject.class);
	  sleep(5);
	  
	  ConfiPage.updateProfile(sFirstName,sLastName,sEmail, sCurrentPassword, sNewPassword);   
  }


  @DataProvider 
  public Object[][] getdata(){
	  Object [][] data = new Object[1][9]; 
	  data [0][0]  = "8130658504";
	  data [0][1]  = "password";
	  data [0][2]  = "Configuration";
	  data [0][3]  = "profile";
	  data [0][4]  = "Kaish Alam";
	  data [0][5]  = "Ansari";
	  data [0][6]  = "kabraekta03gmail.com";
	  data [0][7]  = "pw@2020";
	  data [0][8]  = "password";
	return data;
	  
  }
}
