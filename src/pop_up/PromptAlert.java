package pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		String given_text="Hello SaiDeepak How are you today";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html ");
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("SaiDeepak");
		a.accept();
		String current_text = driver.findElement(By.id("demo")).getText();
		if (given_text.contains(current_text)) {
			System.out.println("you have sucessfully enter data");
			System.out.println(current_text);
			driver.close();
			
		} else {
			System.out.println("data is unsucessfully");
			driver.close();
		}
	}

}
