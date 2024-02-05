package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ksaid/Downloads/demo-1.html");
		WebElement Multidropdown = driver.findElement(By.id("multiple_cars"));
		Select S_ref = new Select(Multidropdown);
		List<WebElement> web = S_ref.getOptions();
		for (WebElement d : web) {
			d.click();
			System.out.println(d.getText());		
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		S_ref.deselectAll();

	}

}
