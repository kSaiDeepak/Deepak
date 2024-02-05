package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ksaid/Downloads/demo-1.html");
	Thread.sleep(2000);
	WebElement Singleselect = driver.findElement(By.cssSelector("select[id='standard_cars']"));
	Thread.sleep(2000);
	Select S_ref = new Select(Singleselect);
	Thread.sleep(2000);
	S_ref.selectByVisibleText("Mercedes");
	Thread.sleep(2000);
	S_ref.selectByValue("hda");
	Thread.sleep(2000);
	S_ref.selectByIndex(9);
	Thread.sleep(2000);
	driver.close();
	}

}
