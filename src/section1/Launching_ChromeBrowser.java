package section1;
// step:- import chromedriver
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_ChromeBrowser {

	public static void main(String[] args) {
		// step:1 set the property of chromeDriver
		
		//System.setProperty("webdriver.chrome.driver",
			//	"D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// step:2 create an object of chromeDriver
		ChromeDriver driver=new ChromeDriver();
		// step :4 access a web application
		//driver.get("https://www.flipkart.com/");

	}

}
