package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Firefox {

	public static void main(String[] args) {
		
		FirefoxDriver drive=new FirefoxDriver();
		drive.get("https://www.flipkart.com/");

	}

}

