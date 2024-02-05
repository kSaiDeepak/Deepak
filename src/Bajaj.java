import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bajaj {

	public static void main(String[] args) throws Throwable {
		String S="https://www.bajajauto.com/1";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/");
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
