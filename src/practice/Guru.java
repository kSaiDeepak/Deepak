package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rigthclick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li/span"));
		Actions a=new Actions(driver);
		for (WebElement web : options) {
			a.moveToElement(rigthclick).contextClick().build().perform();
			web.click();
			Alert a1 = driver.switchTo().alert();
			System.out.println(a1.getText());
			a1.accept();
			Thread.sleep(2000);
			
		}
		driver.close();
	}
}