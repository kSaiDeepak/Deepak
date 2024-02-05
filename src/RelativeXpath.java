import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import locators.UtilityForDemoWebShop;

public class RelativeXpath extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		openDWS();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ksaideeepak7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Deepak1313");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		CloserBrowser();
	

	}

}
