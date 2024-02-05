package Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rigthclick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		Actions a=new Actions(driver);
		a.contextClick(rigthclick).build().perform();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
		Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
	}
	

}
