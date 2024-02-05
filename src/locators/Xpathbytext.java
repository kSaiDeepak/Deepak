package locators;

import org.openqa.selenium.By;

public class Xpathbytext extends UtilityForDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		openDWS();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(2000);
		CloserBrowser();
		

	}

}
