import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ktm {

	public static void main(String[] args) throws InterruptedException {
		String S="https://www.ktmindia.com/ktm-bikes/supersport/ktm-rc-125?utm_source=google&utm_medium=cpc&utm_campaign=EDM_Brand_KTMRC_lower_Search_South_Exact&utm_customdetails=Brand_RC_KTM_RC_125&utm_customdetails1=Adv_LeadGen_D2C&utm_customdetails2=Display_Google&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaHHUkat7mTPGHJder2WaN-aaDw8Zu-13cfA5CtZB7s0YHl7N3esccwaAoo9EALw_wcB";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/ktm-bikes/supersport/ktm-rc-125?utm_source=google&utm_medium=cpc&utm_campaign=EDM_Brand_KTMRC_lower_Search_South_Exact&utm_customdetails=Brand_RC_KTM_RC_125&utm_customdetails1=Adv_LeadGen_D2C&utm_customdetails2=Display_Google&gad_source=1&gclid=Cj0KCQiAyKurBhD5ARIsALamXaHHUkat7mTPGHJder2WaN-aaDw8Zu-13cfA5CtZB7s0YHl7N3esccwaAoo9EALw_wcB");
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
