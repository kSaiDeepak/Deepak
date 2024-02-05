import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {

	public static void main(String[] args) {
		String s="//student.qspiders.com/login";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("//student.qspiders.com/login");
		String S1=driver.getCurrentUrl();
		System.out.println(S1);
		if(s.equals(S1)) {
			System.out.println("url is same");
		}
		else
			System.out.println("not same");
		driver.close();
	  

	}

}
