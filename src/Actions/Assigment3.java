package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment3 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	WebElement Home = driver.findElement(By.xpath("//a[@data-reactid=\"499\"]"));
	Actions action=new Actions(driver);
	action.moveToElement(Home).perform();
	driver.findElement(By.xpath("//a[@data-reactid=\"591\"]")).click();
	}

}
