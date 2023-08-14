package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Mail extends New {

	@Test(dependsOnMethods = "loginTest", alwaysRun=true)
	public void mail() throws InterruptedException {
		driver.wait(2000);
		driver.findElement(By.linkText(loc.getProperty("linkTxt"))).click();
		driver.findElement(By.linkText(loc.getProperty("analytics"))).click();
		String text = driver.findElement(By.cssSelector(loc.getProperty("analyticsTxt"))).getText();
		assert text == "Modern Self-service BI and Analytics Platform";
	}
}
