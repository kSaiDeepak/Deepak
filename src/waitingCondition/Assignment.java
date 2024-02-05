package waitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
        WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
        facebook.click();
        WebElement createaccount = driver.findElement(By.xpath("//a[@id=\"u_0_0_U7\"]"));
        if (createaccount.isDisplayed()) {
			System.out.println("you can createaccount");
		} else {
           System.out.println(" you doesnt create account close the browser");
           driver.close();
		}
	}

}
