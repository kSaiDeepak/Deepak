import org.openqa.selenium.By;

import locators.UtilityForDemoWebShop;

public class AbsoluteXpathPratice extends UtilityForDemoWebShop{

	public static void main(String[] args) throws InterruptedException {
	ChromeBrowser();
	Thread.sleep(1000);
	openDWS();
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[4]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[6]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body/div[4]/div/div[2]/ul/li[7]/a")).click();
	Thread.sleep(2000);
	CloserBrowser();
		
	}

}
