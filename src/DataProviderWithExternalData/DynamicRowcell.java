package DataProviderWithExternalData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicRowcell {
	@DataProvider(name="login")
	 public Object[][] sender() throws EncryptedDocumentException, IOException{
		File file = new File("E:\\Excelsheets\\login.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wfb = WorkbookFactory.create(fis);
		Sheet sheet = wfb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int coloun = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] obj=new Object[row][coloun];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloun; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
		}
		return obj;
	}
	@Test(dataProvider = "login")
	public void receiver(String email,String password){
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
	}
}
