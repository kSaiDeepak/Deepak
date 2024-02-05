package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS {
	@Test
	public void sw(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.quit();
	Reporter.log("dws",true);
	}
	@Test
	public void A() {
		System.out.println("hello");
	}
	@Test
	public void D() {
		Reporter.log("bye",true);
	}
}
