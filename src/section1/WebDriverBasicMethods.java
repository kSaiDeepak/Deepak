package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicMethods {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", 
		//		"D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.in/");
		//to fetch the Title//
	String currentWebPageTitle =driver.getTitle();
	//to fetch the src code//
	String srccode= driver.getPageSource();
	//to fetch the current url//
	 String currentUrl=driver.getCurrentUrl();
	 System.out.println(currentUrl);
	 System.out.println(currentWebPageTitle);
	 System.out.println(srccode );
		

	}

}
