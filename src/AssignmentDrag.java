import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentDrag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    WebElement i = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
	    WebElement i1 = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
	    WebElement i2= driver.findElement(By.xpath("//div[@id=\"box1\"]"));
	    WebElement i3= driver.findElement(By.xpath("//div[@id=\"box4\"]"));
	    WebElement i4 = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
	    WebElement i5= driver.findElement(By.xpath("//div[@id=\"box2\"]"));
	    WebElement i6= driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		WebElement target = driver.findElement(By.xpath("//div[@class=\"dragableBoxRight\"]"));
		WebElement target1 = driver.findElement(By.xpath("//div[@id=\"box107\"]"));
		WebElement target2= driver.findElement(By.xpath("//div[@id=\"box101\"]"));
		WebElement target3 = driver.findElement(By.xpath("//div[@id=\"box104\"]"));
		WebElement target4 = driver.findElement(By.xpath("//div[@id=\"box105\"]"));
		WebElement target5 = driver.findElement(By.xpath("//div[@id=\"box102\"]"));
		WebElement target6 = driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(i, target).build().perform();
		a.dragAndDrop(i1, target1).build().perform();
		a.dragAndDrop(i2, target2).build().perform();
		a.dragAndDrop(i3, target3).build().perform();
		a.dragAndDrop(i4, target4).build().perform();
		a.dragAndDrop(i5, target5).build().perform();
		a.dragAndDrop(i6, target6).build().perform();
		
		}
	}

