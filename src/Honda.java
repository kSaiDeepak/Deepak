import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Honda {
	public static void main(String[] args) {
		 String S="https://www.honda2wheelersindia.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		System.out.println(driver.getCurrentUrl());
	    String	S1=driver.getCurrentUrl();
	    if (S.equals(S1)) {
	    	System.out.println("Url is same");	
		}
	    else {
			System.out.println("url is not same");
		}
	    driver.close();
	}

}
