package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.amazon.in/");
		WebElement sign = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(sign).build().perform();
		driver.findElement(By.xpath("  //span[text()='Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("ksaideepak37@gmail.com");
		driver.findElement(By.cssSelector("[class=\"a-button-input\"]")).click();
		driver.findElement(By.name("password")).sendKeys("Deepak@224");
		driver.findElement(By.cssSelector("[id=\"signInSubmit\"]")).click();
		WebElement lang = driver.findElement(By.xpath("//span[@class=\"icp-nav-link-inner\"]"));
		a.moveToElement(lang).build().perform();
		WebElement language = driver.findElement(By.xpath("(//a[@class=\"nav-link                                    nav-item\"])/span/span"));
		Select s=new Select(language);
		List<WebElement> option = s.getOptions();
		int i=0;
		for (WebElement web: option) {
			language = driver.findElement(By.xpath("(//a[@class=\"nav-link                                    nav-item\"])/span/span"));
			s.selectByIndex(i++);
			web.click();
			Thread.sleep(2000);
			
		}
		}

}
