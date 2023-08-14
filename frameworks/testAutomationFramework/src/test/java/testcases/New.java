package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSLData;


public class New extends BaseTest {

	@Test(dataProviderClass=ReadXLSLData.class, dataProvider="tdata")
	public void loginTest(String email, String password) throws InterruptedException {
		driver.findElement(By.linkText(loc.getProperty("signInBtn"))).click();
		driver.findElement(By.id(loc.getProperty("emailField"))).sendKeys(email);
		driver.findElement(By.id(loc.getProperty("nxtBtn1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("passwordField"))).sendKeys(password);
		driver.findElement(By.id(loc.getProperty("nxtBtn2"))).click();
	}
}
