import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kalkifashion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.kalkifashion.com/in/");
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class=\"mega-tab-menu half-mobile-menu\"]"));
		List<WebElement> product = driver.findElements(By.xpath("//div[@class=\"mega-tab-menu\"]/a"));
		product.remove(4);
		Products.remove(8);
		Actions a=new Actions(driver);
		for (WebElement web : product) {
			a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
			Thread.sleep(2000);
		}
         driver.quit();
	}

}
