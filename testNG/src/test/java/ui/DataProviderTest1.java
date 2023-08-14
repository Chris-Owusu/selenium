package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest1 {
	
	@Test(dataProvider="login")
	public void test(String username, String password) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();
		
		driver.close();
	}
	
	
	@DataProvider(name="login")
	public Object[][] loginObj() {
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"},
			{"performance_glitch_user", "secret_sauce"}
		};
	}
}
