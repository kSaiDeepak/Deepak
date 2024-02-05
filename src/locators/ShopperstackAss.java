package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstackAss  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.navigate().to("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
	    Thread.sleep(2000);
	    WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
	    System.out.println(register.getText());
	    driver.close();		
	}
}
