package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincss {
	public static void main(String[] args) throws InterruptedException {
		String given_url="https://demowebshop.tricentis.com/";
		String given_loginTitle="Demo Web Shop. Login";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.contains(current_url)) {
			System.out.println("You are Web demoshop page");
			driver.findElement(By.cssSelector("a[class='ico-login']")).click();
			String Current_Logintitle=driver.getTitle();
			if (given_loginTitle.contains(Current_Logintitle)) {
				System.out.println("you are in login page");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[class='email']")).sendKeys("deepak@1313Gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[class='password']")).sendKeys("deepak");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else {
				System.out.println("you are not in the login page");
			}
		}
		else {
			System.out.println("you are in demo web shop page");
		}
	}
}