package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import testSuite.beforeSuiteAfterSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assertTest extends beforeSuiteAfterSuite {
	
	@Test
	public void assertTest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String expectedResult = "Swagger UI";
		
		driver.get("https://gitinspired-rw-api.amalitech-dev.net/api/docs/#/");
		String actualResult = driver.getTitle();
//		System.out.println(actualResult);
		
		assertEquals(expectedResult, actualResult);
		
		driver.close();
		
	}

}
