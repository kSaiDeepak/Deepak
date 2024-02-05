package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismulti {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ksaid/Downloads/demo-1.html");
		 WebElement SingleDropdown= driver.findElement(By.id("standard_cars"));
		 WebElement MultiDropdown = driver.findElement(By.id("multiple_cars"));
		 Select S1 = new Select(SingleDropdown);
		 Select S2 = new Select(MultiDropdown);
		 if (S1.isMultiple()) {
			 System.out.println("you are Using S1 drop down menu");
			 List<WebElement> S1_values = S1.getOptions();
			 for (WebElement web : S1_values) {
				 web.click();
				 Thread.sleep(2000);
				
			}
			 S1.deselectAll();
		} else {
       System.out.println("You are using S2 dropdown menu");
       List<WebElement> S2_values = S2.getOptions();
       for (WebElement Element : S2_values) {
		Element.click();
		Thread.sleep(2000);;
	}
       S2.deselectAll();
		}
		 driver.close();;  

	}

}
