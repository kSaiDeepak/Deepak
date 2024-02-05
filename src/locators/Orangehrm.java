package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		 Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		 Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
