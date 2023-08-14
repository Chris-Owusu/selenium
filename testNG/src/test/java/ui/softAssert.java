package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import testSuite.beforeSuiteAfterSuite;

import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class softAssert extends beforeSuiteAfterSuite {
	
	@Test
	public void assertTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		SoftAssert softassert = new SoftAssert();
		
		String expectedResult = "Swagger UI";
		driver.get("https://gitinspired-rw-api.amalitech-dev.net/api/docs/#/");
		String actualResult = driver.getTitle();
		softassert.assertEquals(expectedResult, actualResult);
		String act = "Authorize";
		String expted = driver.findElement(By.xpath("//*[@id=\"swagger-ui\"]/section/div[2]/div[2]/div[2]/section/div[2]/button/span")).getText();
		softassert.assertEquals(act, expted, "This is the authorize");
		
		softassert.assertAll();
		driver.close();
		
	}

}
