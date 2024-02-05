package Otherapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);
		WebElement Singleselect = driver.findElement(By.cssSelector("select[id='products-orderby']"));
		Thread.sleep(2000);
		Select S_ref = new Select(Singleselect);
		Thread.sleep(2000);
		S_ref.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		driver.close();

	}

}
