package TestNg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers {
	WebDriver driver;
	@Parameters("Driver")
	@Test
	public void browsers(String div) {
		if (div.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("i am chromedriver");
			Reporter.log("Chromedriver");					
			
		} else if (div.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("i am edgedriver");
			Reporter.log("edge driver");
		} 
		else if (div.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("i am firefox");
			Reporter.log("firefox");
		} else {

		}
		}
	}

