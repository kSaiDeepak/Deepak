package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();	
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("initial")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='greyButton cancelBtn']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
