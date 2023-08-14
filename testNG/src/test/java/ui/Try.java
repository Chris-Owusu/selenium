package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Try {
	
	@Test(retryAnalyzer = testSuite.Retry.class)
	public void visit() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://jestjs.io/docs/using-matchers");
		Assert.assertTrue(false);
		driver.close();
	}

}
