package TestNg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChrornologicalOrder {
@BeforeSuite
public void beforeSuite() {
	System.out.println("before suite");
}
@BeforeTest
public void Beforetest() {
	System.out.println("before test");	
}
@BeforeClass
public void beforeclass() {
	System.out.println("before class");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("before method");
}
@Test
public void test() {
	System.out.println("test");
}
@AfterMethod
public void aftermethod() {
	System.out.println("aftermethod");
}
@AfterClass
public void afterclass() {
	System.out.println("after class");
}

}
