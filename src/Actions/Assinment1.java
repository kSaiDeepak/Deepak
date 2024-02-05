package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assinment1 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	WebElement women = driver.findElement(By.xpath("//a[@data-reactid=\"180\"]"));
	Actions action=new Actions(driver);
	action.moveToElement(women).perform();
	driver.findElement(By.xpath("//a[text()='Sarees']")).click();

	}

}
