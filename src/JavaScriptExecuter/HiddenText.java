package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.facebook.com/r.php?r=101");
		JavascriptExecutor je=(JavascriptExecutor) driver;
		WebElement gender = driver.findElement(By.name("custom_gender"));
		je.executeScript("arguments[0].value='Successfull';", gender);
	}

}
