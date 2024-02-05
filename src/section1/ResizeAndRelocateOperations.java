package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndRelocateOperations {
	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.manage().window().setSize(new Dimension(350, 300));
		Dimension d=new Dimension(350,300);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		//driver.manage().window().setPosition(new Point(200,300));
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000);
		driver.close();

	}

}
