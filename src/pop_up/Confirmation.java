package pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html ");
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(2000);
		driver.close();
	}

}
