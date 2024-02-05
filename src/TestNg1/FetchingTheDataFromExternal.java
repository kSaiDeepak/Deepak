package TestNg1;

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
import org.testng.annotations.Test;

public class FetchingTheDataFromExternal {
@Test
 public void Dwslogin() throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	File file = new File("E:\\Excelsheets\\login.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wfb = WorkbookFactory.create(fis);
	Sheet sheet = wfb.getSheet("Sheet1");
	String email = sheet.getRow(0).getCell(0).toString();
	String password = sheet.getRow(0).getCell(1).toString();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
	
}
}
