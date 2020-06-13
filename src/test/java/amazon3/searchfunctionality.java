package amazon3;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class searchfunctionality extends baseclass{
	
	@Test(priority=1)
	public void search_n95mask() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("n95mask");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
	@Test(priority=2)
	public void search_nintendo() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("nintendo");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
	@Test(priority=3)
	public void search_ps4() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
	@Test(priority=4)
	public void search_sanitizer() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("sanitizer");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
	@Test(priority=5)
	public void search_weber() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("weber");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
	@Test(priority=6)
	public void search_airpodpro() {
	browser.findElement(By.id("twotabsearchtextbox")).sendKeys("airpodpro");//searching for n95mask
	browser.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//maximum wait 10sec
	browser.findElement(By.xpath("//div[@id='issDiv0']")).click();//clicking n95mask in searchbox	
	}
    }
