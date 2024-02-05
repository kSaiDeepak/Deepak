package section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizationAndMinimization {

	public static void main(String[] args) throws Exception {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.manage().window().minimize();
    Thread.sleep(3000);
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.close();
	}

}
