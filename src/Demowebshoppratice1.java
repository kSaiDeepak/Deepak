import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Demowebshoppratice1 {

	public static void main(String[] args) throws InterruptedException {
		String S1="https://demowebshop.tricentis.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String S2 = driver.getCurrentUrl();
		if (S1.contains(S2)) {
			System.out.println("Your are in Demo web shop page");
			List<WebElement> RLSW = driver.findElements(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li/a"));
			for (WebElement web : RLSW) {
				System.out.println(web.getText());
				Thread.sleep(2000);
			}
			
		} else {
           System.out.println(" your are not in Demo Shop Page");
		}
		driver.close();

	}

}
