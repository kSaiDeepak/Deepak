import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		String id="small-searchterms";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);
		WebElement Search_box = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
		Thread.sleep(2000);
        String attribute_value = Search_box.getAttribute("id");
        Thread.sleep(2000);
        System.out.println(attribute_value);
        if (id.equals(attribute_value)) {
			System.out.println("your script is correct");
		} else {
           System.out.println("check the Script.............");
		}
        Thread.sleep(2000);
        driver.close();
	}

}
