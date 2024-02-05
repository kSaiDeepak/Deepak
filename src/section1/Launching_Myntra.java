package section1;

import org.openqa.selenium.chrome.ChromeDriver;
 class Launching_Myntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
	    String currentUrl=driver.getCurrentUrl();
		Thread.sleep(3000);
		String title=driver.getTitle();
		Thread.sleep(3000);
	    System.out.println(currentUrl);
	    System.out.println(title);
		driver.close();
	}
		
}
