package ClassforL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
 public static void main(String[] args) throws InterruptedException  {
	//ChromeDriver driver= new ChromeDriver();
	 String  url="https://demowebshop.tricentis.com/login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
    driver.findElement(By.tagName("img")).click();
   // String currenturl = driver.getCurrentUrl();
    //if (url.contains(currenturl)) {
	//	System.out.println("sucess");
	//} else {
    //   System.out.println("fail");
	//}
} 
}
