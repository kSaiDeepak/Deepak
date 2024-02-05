package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.navigate().to("https://skillrary.com/");
		//driver.findElement(By.xpath("//a[@class=\"close_cookies\"]")).click();
		//WebElement learn_more = driver.findElement(By.xpath("//a[@class=\"btn\"]"));
		JavascriptExecutor je=(JavascriptExecutor) driver;
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement simple = driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[6]"));
        je.executeScript("arguments[0].scrollIntoView(false);", simple);
	}

}
