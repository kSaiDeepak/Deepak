package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActitimeWithIdNameClassName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement Elements=driver.findElement(By.id("username"));
			   Elements.sendKeys("admin");
		Thread.sleep(3000);
		WebElement Element1= driver.findElement(By.name("pwd"));
		Element1.sendKeys("manager");
		Thread.sleep(3000);
	WebElement Element2	=driver.findElement(By.id("keepLoggedInCheckBox"));
		Element2.click();
		Thread.sleep(3000);
	WebElement Element3=driver.findElement(By.className("initial"));
	    Element3.click();
		Thread.sleep(5000);
		driver.close();

	}

}
