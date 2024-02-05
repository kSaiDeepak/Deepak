package locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DigitalPratice extends UtilityForDemoWebShop{
	public static void main(String[] args) throws InterruptedException {
		ChromeBrowser();
		openDWS();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
		WebElement digital = driver.findElement(By.cssSelector("div[class='page-title']"));
		if (digital.isDisplayed()) {
			System.out.println("you are in digital download page");
			List<WebElement> Addcart = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			for (WebElement add : Addcart) {
				add.click();
				Thread.sleep(2000);
			}
			driver.findElement(By.cssSelector(" span[class='cart-label']")).click();
			List<WebElement> removecart = driver.findElements(By.cssSelector("input[name='removefromcart']"));
			for (WebElement Element : removecart) {
				Element.click();
				Thread.sleep(2000);
			}
			driver.findElement(By.cssSelector("input[name='updatecart']")).click();
		} else {
			System.out.println("You are not in digital download page");

		}
		Thread.sleep(2500);
		CloserBrowser();

	}

}
