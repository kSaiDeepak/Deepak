package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(3000);
			driver.getCurrentUrl();
			Thread.sleep(2000);
	        driver.findElement(By.cssSelector("a[class='ico-register']")).click();
	        Thread.sleep(2000);
	        driver.getTitle();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[type='radio']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Sai");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Deepak");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("124256@gmail.com");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1231233");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("1231233");
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[type='submit']")).click();
	        Thread.sleep(2000);
	        driver.close();

	}

}
