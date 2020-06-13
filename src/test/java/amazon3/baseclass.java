package amazon3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass  {
	
	public WebDriver browser;
	
	 @BeforeMethod (alwaysRun=true)
	public void login() {
	 System.setProperty("webdriver.chrome.driver", "/Users/ashrafhossain/Downloads/chromedriver83/chromedriver");
	 browser = new ChromeDriver();
	 //going to website
	 browser.get("https://www.amazon.com/");
	 //maximizing window
	 browser.manage().window().maximize();
	 
	 browser.manage().deleteAllCookies();
	 
	 browser.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 }
	

	 @AfterMethod (alwaysRun=true)
	 public void close() throws InterruptedException {
	 //2 sec pause
	 Thread.sleep(2000);
	 //closing browser
	 browser.quit();	
	 }

}
