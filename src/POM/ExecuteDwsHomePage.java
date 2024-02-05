package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDwsHomePage {
@Test
public void reciver() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	DWSHomepage execute = new DWSHomepage(driver);
	//execute.searchField.sendKeys("pen");
	//execute.searchbutton.click();
	execute.searchField("book");
	execute.searchButton();
}
}
