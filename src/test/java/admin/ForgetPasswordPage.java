package admin;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.BaseClass;
import admin.pageObject.ForgetPasswordPageObject;
import admin.pageObject.LoginPageObject;

public class ForgetPasswordPage extends BaseClass{
	

@Test (dataProvider = "getdata",priority = 2)
  public void testcaseVerifyForgetPasswordPage(String UserNo) throws IOException {
	  LaunchandMaxmize(); 
	  LoginPageObject LoginPage = PageFactory.initElements(driver, LoginPageObject.class);
	  LoginPage.ClickOnForgetPassword();
	  ForgetPasswordPageObject page = PageFactory.initElements(driver, ForgetPasswordPageObject.class);
	  page.ForgetPassword(UserNo);
	  
	  
  }
  @DataProvider 
  public Object[] getdata() {
	  Object [] data = new Object[1];
	  data[0] = "8130658504";  
	  return data; 
  }
  @Test(priority = 1) 
  public void testcaseGotoMainPage() throws IOException {
	  LaunchandMaxmize(); 
	  LoginPageObject LoginPage = PageFactory.initElements(driver, LoginPageObject.class);
	  LoginPage.ClickOnForgetPassword();
	  ForgetPasswordPageObject page = PageFactory.initElements(driver, ForgetPasswordPageObject.class);
	  page.GotoBacklinkPage();
	  sleep(5);
	  String actualurl = driver.getCurrentUrl();
	  String expectedurl = "https://admin-dev.penpencil.xyz/pages/auth/login";
	  assertEquals(actualurl,expectedurl); 
  }
  
}
