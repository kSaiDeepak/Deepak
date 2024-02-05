package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigitalDownload {

	public static void main(String[] args) throws InterruptedException {
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String Current_url=driver.getCurrentUrl();
		if (given_url.contains(Current_url)) {
			System.out.println("you are in demowebshop page");
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Digital download")).click();
			String Current_Digitaltile=driver.getTitle();
			if (given_title.contains(Current_Digitaltile)) {
				System.out.println("You are in digital download page");
				Thread.sleep(2000);
				List<WebElement> community_pool = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for (WebElement web: community_pool) {
					web.click();
					Thread.sleep(2000);					
				}
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				WebElement Shoppingcart = driver.findElement(By.cssSelector("div[class='page-title']"));
				if (Shoppingcart.isDisplayed()) {
					System.out.println("you are in shopping cart page");
				}
				Thread.sleep(2000);
				driver.close();				
			}
			else {
				System.out.println("you are not in the digitaldownload page");
			}
		}
		else {
			System.out.println("you are in the demowebshop page");
		}
		
	}

}
