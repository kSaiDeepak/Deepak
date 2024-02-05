package section1;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOperations {

	public static void main(String[] args) throws Exception {
	ChromeDriver driver=new ChromeDriver();
	/*
	Navigation nav=driver.navigate();
	driver.get("https://demo.actitime.com/login.do");
	//nav.to("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.get("https://www.flipkart.com/");
	//nav.to("https://www.flipkart.com/");
	Thread.sleep(4000);
	nav.back();
	Thread.sleep(4000);
	nav.forward();
	Thread.sleep(4000);
	nav.refresh();*/
	driver.navigate().to("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.close();

	}

}
