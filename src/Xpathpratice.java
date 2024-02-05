import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpratice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);
	   List<WebElement> Web = driver.findElements(By.xpath("//div[@class='item-box']/div/div[2]/div[3]/div/span"));
	   for (WebElement webElement : Web) {
		  System.out.println( webElement.getText());
		  Thread.sleep(2000);
		
	}
	}

}
