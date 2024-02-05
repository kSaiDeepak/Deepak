import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tvs {

	public static void main(String[] args) throws InterruptedException {
		String S="https://www.tvsmotor.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tvsmotor.com/");
		System.out.println(driver.getCurrentUrl());
	    String	S1=driver.getCurrentUrl();
	    if (S.equals(S1)) {
	    	System.out.println("Url is same");	
		}
	    else {
			System.out.println("url is not same");
		}
	    Thread.sleep(3000);
	    driver.close();

	}

}
