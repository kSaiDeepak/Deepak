package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Shoppingcart = driver.findElement(By.cssSelector("h2[class='topic-html-content-header']"));
		if (Shoppingcart.isDisplayed()) {
			System.out.println(" you are in demo web shop page");			
		} else {
			System.out.println("you are in not demo page");
		}
		driver.findElement(By.cssSelector("a[href='/digital-downloads']")).click();
		WebElement DigitalDownload = driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
		if (DigitalDownload.isDisplayed()) {
			System.out.println("you are in digital download page");			
		} else {
			System.out.println("you are in not digital downloads page");
		}
		List<WebElement> community_pool = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		for (WebElement web: community_pool) {
			web.click();
			Thread.sleep(2000);					
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='cart-label']")).click();
		WebElement shopping = driver.findElement(By.cssSelector("div[class='page-title']"));
		if (shopping.isDisplayed()) {
			System.out.println("you are in shopping cart page");
		}
		 List<WebElement> community_pool1 = driver.findElements(By.cssSelector("input[name='removefromcart']"));
		 community_pool1.remove(2);
		// community_pool1.remove(community_pool1.size()-1);
		for (WebElement rem : community_pool1) {
			rem.click();
			Thread.sleep(1000);			
		}
		driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
		WebElement Cart = driver.findElement(By.cssSelector("div[class='page-title']"));
		if (Cart.isDisplayed()) {
			System.out.println("You are in shopping cart");			
		} else {
			System.out.println("you are not in shopping cart page");

		}
		driver.close();
	}

}
