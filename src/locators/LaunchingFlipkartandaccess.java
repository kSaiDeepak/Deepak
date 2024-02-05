package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingFlipkartandaccess {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://flipkart.com");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("span[role='button']")).click();
	Thread.sleep(3000);
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("iphone 14");
    Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	driver.close();
	}
	}