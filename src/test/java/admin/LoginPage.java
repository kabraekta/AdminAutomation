package admin;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.BaseClass;
import admin.pageObject.LoginPageObject;
    
public class LoginPage extends BaseClass {
	

 
@Test(priority = 1)
  public void testcasegetTitleofPage() throws IOException { 
	 LaunchandMaxmize();
	 String actualTitle = driver.getTitle(); 
	 String expectedTitle = "Pen & Pencil";
	 assertEquals(expectedTitle,actualTitle); 
  }
  @Test (dataProvider = "getdata", priority = 2)
  public void testcaseUserLogin(String UserNo, String Password) throws IOException {
	  LaunchandMaxmize();
	  sleep(5);
	  LoginPageObject page = PageFactory.initElements(driver, LoginPageObject.class);
	  page.UserLogin(UserNo,Password);
	  String actualurl = "https://admin-dev.penpencil.xyz/apps/dashboard"; 
	  String expectedurl = driver.getCurrentUrl();
	  assertEquals(actualurl,expectedurl);   
  }
  @Test (priority = 3)
  public void testcaseForgetPasswordPage() throws IOException {
	  LaunchandMaxmize();
	  LoginPageObject page = PageFactory.initElements(driver, LoginPageObject.class);
	  page.ClickOnForgetPassword();
	  sleep(5);
	  String actualurl = "https://admin-dev.penpencil.xyz/pages/auth/forgot-password";
	  String expectedurl = driver.getCurrentUrl();
	  assertEquals(actualurl,expectedurl);  
  }
  // Data for Login 
  @DataProvider 
  public Object[][] getdata(){
	  Object [][] data = new Object[1][2]; 
	  data [0][0]  = "8130658504";
	  data [0][1]  = "password";
	return data;
	  
  }
}
