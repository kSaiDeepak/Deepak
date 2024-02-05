package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {

	public static void main(String[] args) throws Exception {
	 ChromeDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.flipkart.com");
	 Thread.sleep(3000);
	 driver.get("https://www.amazon.com");
	 Thread.sleep(3000);
	 driver.navigate().back();
	 Thread.sleep(3000);
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.navigate().refresh(); 
	 Thread.sleep(2000);
	 driver.close();

	}

}
