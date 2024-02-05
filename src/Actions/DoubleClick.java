package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions a=new Actions(driver);
		a.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
		try {
			doubleclick.isEnabled();
			System.out.println("the script is uncessfull");
		} catch (Exception e) {
			System.out.println("the script is sucessfull");
		}
		
	}

}
