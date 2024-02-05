import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Royalenfield {

	public static void main(String[] args) throws Exception {
		String S="https://www.royalenfield.com/in/en/home/ ";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/home/");
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
