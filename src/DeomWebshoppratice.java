import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeomWebshoppratice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> Bce = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ul/li/a"));
		for (WebElement web: Bce) {
			System.out.println( web.getText());
		}
		driver.close();
		
	}

}
