package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysDWs {

	public static void main(String[] args) {
	String givenurl="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String Currenturl=driver.getCurrentUrl();
	if (givenurl.equals(Currenturl)) {
		System.out.println("You are in Dws page");
		WebElement seacrch_field = driver.findElement(By.id("small-searchterms"));
		Actions a=new Actions(driver);
		if (seacrch_field.isEnabled()) {
			System.out.println("search field is enable");
			a.moveToElement(seacrch_field).click().sendKeys("books").build().perform();
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			System.out.println("Script is successfull");
			driver.close();
		} else {
            System.out.println("search field is not enable ");
		}
	} else {
       System.out.println("You ae not in dws page");
       System.out.println("script is unsucessfull");
       driver.close();
	}
	}

}
