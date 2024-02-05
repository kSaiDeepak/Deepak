package pop_up;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getwindowhandle {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	 driver.get("https://demowebshop.tricentis.com/");
	 String Parent= driver.getWindowHandle();
	System.out.println(Parent);
	 Actions a=new Actions(driver);
	 a.keyDown(Keys.PAGE_DOWN).build().perform();
	 a.keyDown(Keys.PAGE_DOWN).build().perform();
     WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
     Thread.sleep(2000);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
     a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
	 Set<String> Child = driver.getWindowHandles();
	 Child.remove(Parent);
	 for (String str : Child) {
		driver.switchTo().window(str);
	}
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Not now']")));
	 driver.findElement(By.xpath("//span[text()='Not now']")).click();
	 System.out.println("script is sucessfull");
	 driver.quit();
	}

}
