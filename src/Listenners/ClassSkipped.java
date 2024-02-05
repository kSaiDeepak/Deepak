package Listenners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenners.StartListeners.class)
public class ClassSkipped {
	@Test(timeOut = 1000)
	public void m1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Execution m1");
	}
	@Test(dependsOnMethods = "m1")
	public void m2() {
		System.out.println("executing m2");
	}

}
