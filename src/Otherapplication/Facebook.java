package Otherapplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
		String Currenturl = driver.getCurrentUrl();
		if (url.contains(Currenturl)) {
			System.out.println("You are in facebook page");
			driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
			        Thread.sleep(2000);
				WebElement singup = driver.findElement(By.xpath("//div[text()='Sign Up']"));
				if (singup.isDisplayed()) {
					System.out.println("you are in singup page");
					driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Saideepak");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Killani");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("ksaideepak37@gmail.com");
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//input[@data-type=\"text\"])[4]")).sendKeys("ksaideepak37@gmail.com");
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Deepak@1313");
					Thread.sleep(2000);
					WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
					Thread.sleep(2000);
					Select DayRef = new Select(day);
					DayRef.selectByValue("17");
					Thread.sleep(2000);
					WebElement Mon = driver.findElement(By.xpath("//select[@id='month']"));
					Thread.sleep(2000);
					Select Month = new Select(Mon);
					Thread.sleep(2000);
					Month.selectByVisibleText("May");
					Thread.sleep(2000);
					WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
					Thread.sleep(2000);
					Select Yearref = new Select(year);
					Thread.sleep(2000);
					Yearref.selectByIndex(22);
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@name='websubmit']")).click();
					Thread.sleep(2000);
				} else {
                    System.out.println("you are not in singup page");
				}
			}			
		 else {
			System.out.println("Your are in not facebook page");

		}
		driver.close();
	}

}
