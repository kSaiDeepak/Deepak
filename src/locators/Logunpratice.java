package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logunpratice extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		openDWS();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.cssSelector("div[class='page-title']"));
		if (login.isDisplayed()) {
			System.out.println("You are in login page");
			driver.findElement(By.cssSelector("input[class='email']")).sendKeys("ksaideepak7@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("DEEPAK1313");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='RememberMe']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
		} else {
             System.out.println("you are not in login page");
		}
		Thread.sleep(2000);
		CloserBrowser();
	}
}
