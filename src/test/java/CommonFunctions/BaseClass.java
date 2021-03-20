package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	public String currrentBrowser;
	public String currrentURL; 
	
	
	
	Properties prop = new Properties();
 @BeforeTest
	public  void beforeTest() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\beawa\\eclipse-workspace\\PenPencilAdmin\\src\\test\\resources\\data.properties");
		prop.load(fis);
        currrentBrowser = prop.getProperty("browser");
		if(currrentBrowser.equals("chrome")) 
		{
		  WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   
		}else if (currrentBrowser.equals("firefox"))
		{
			  WebDriverManager.firefoxdriver().setup();
			   driver = new FirefoxDriver();
			
		}else if (currrentBrowser.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		
	}
	
	
	@AfterTest
	public void aftertest() {
     driver.quit();  
	  }
	
public void sleep(int seconds) {
		
		try {
			Thread.sleep(seconds* 1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

public void LaunchandMaxmize() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\beawa\\eclipse-workspace\\PenPencilAdmin\\src\\test\\resources\\data.properties");
	prop.load(fis);
    currrentURL = prop.getProperty("url");
    driver.get(currrentURL);
    sleep(2);
    driver.manage().window().maximize();
}
public void ClickMainMenuItem (String sMenuName) {
	sleep(4);
	driver.findElement(By.xpath("//span[contains(text(),'"
			+ sMenuName
			+ "')]")).click();
	
}
 public void ClickSubMenuItem (String sMenuSubName) {
	 sleep(4);
	 driver.findElement(By.xpath("//span[contains(text(),'"
				+ sMenuSubName
				+ "')]")).click();
} 

 /*public void ScrollUpdown (int x, int y, WebDriver driver1) {
		System.out.println(driver1);
	 JavascriptExecutor js = (JavascriptExecutor)driver1;
	 System.out.println(js);
	 
	  js.executeScript("window.scrollBy("
	 		+ x
	 		+ ","
	 		+ y
	 		+ ")"); 	 
 }*/
 
}
