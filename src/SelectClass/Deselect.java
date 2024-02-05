package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/ksaid/Downloads/demo-1.html");
		WebElement Multidropdown = driver.findElement(By.id("multiple_cars"));
		Select S_ref = new Select(Multidropdown);
		S_ref.selectByIndex(1);
		Thread.sleep(2000);
		S_ref.deselectByIndex(1);

	}

}
