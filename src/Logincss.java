import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[class='email']")).sendKeys("Deepak@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[class='password']")).sendKeys("1233456547");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[value='Log in']")).click();
		 Thread.sleep(2000);
		 driver.close();
	}

}
