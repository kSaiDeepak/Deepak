package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice extends UtilityForDemoWebShop {
	public static void main(String[] args) throws InterruptedException  {
		ChromeBrowser();
		openDWS();
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		WebElement Register = driver.findElement(By.cssSelector("div[class='page-title']"));
		if (Register.isDisplayed()) {
			System.out.println("You are in register page");
			driver.findElement(By.cssSelector("input[id='gender-female']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("SAI");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("DEEPAK");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("ksaideepak7@gamil.com");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("DEEPAK1313");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("DEEPAK1313");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='register-button']")).click();
			
		} else {
			System.out.println("You are Not in register page");
		}
		Thread.sleep(1000);
		CloserBrowser();
	
	}
}
