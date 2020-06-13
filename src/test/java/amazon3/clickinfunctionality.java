package amazon3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class clickinfunctionality extends baseclass{
	@Test(priority=1)
	public void bestseller () {
	browser.findElement(By.xpath("//div[@id='nav-xshop-container']//a[1]")).click();
	}
	
	@Test(priority=2,groups={"sanity"})
	public void customer_service () {
	browser.findElement(By.xpath("//div[@id='nav-main']//a[2]")).click();
	}
	@Test(priority=3)
	public void clicking3 () {
	browser.findElement(By.xpath("//div[@id='navFooter']//div[7]//ul[1]//li[6]//a[1]")).click();
	}
	@Test(priority=4)
	public void clicking4 () {
	browser.findElement(By.xpath("//tr[1]//td[13]//a[1]")).click();
	}
	@Test(priority=5)
	public void sell () {
	browser.findElement(By.xpath("//div[@id='nav-main']//a[9]")).click();
	}
	@Test(priority=6)
	public void wholefood () {
	browser.findElement(By.xpath("//div[@id='nav-main']//a[6]")).click();
	}
}
