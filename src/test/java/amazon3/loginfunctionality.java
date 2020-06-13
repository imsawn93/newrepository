package amazon3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class loginfunctionality extends baseclass {
	

	@Test(priority=1)
	public void login_valid()  {
	browser.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();//clicking login button
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	browser.findElement(By.id("ap_email")).sendKeys("ashrafhossainsawn@gmail.com ");//writing email
	browser.findElement(By.id("continue")).click();//clicking countinue
	browser.findElement(By.id("ap_password")).sendKeys("h0tmail93");//writing password
	browser.findElement(By.id("signInSubmit")).click();//clicking submit
	}
	@Test(priority=2)
	public void login_invalid() {
	browser.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();//clicking login button
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	browser.findElement(By.id("ap_email")).sendKeys("1234");//writing email
	browser.findElement(By.id("continue")).click();//clicking countinue
	}
	@Test(priority=3)
	public void login_valid_invalid() {
	browser.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();//clicking login button
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	browser.findElement(By.id("ap_email")).sendKeys("imsawn93@gmail.com");//writing email
	browser.findElement(By.id("continue")).click();//clicking countinue
	browser.findElement(By.id("ap_password")).sendKeys("23");//writing password
	browser.findElement(By.id("signInSubmit")).click();//clicking submit
	
	String exp_value = "Sign-In";
	String act_value = browser.findElement(By.xpath("//div[@id='authportal-main-section']//div//div//div//div//h1")).getText();
	
	
	Assert.assertEquals(exp_value, act_value);

	}
	@Test(priority=4)
	public void login_no_credential() {
	browser.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();//clicking login button
	browser.findElement(By.id("continue")).click();//clicking countinue
    }
    }
	