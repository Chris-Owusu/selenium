package ui;

//import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
//		RelativeLocator.with(By.tagName("input")).below(By.id("user-name")).sendKeys("secret_sauce");
		
//		WebElement password = driver.findElement(By.id("user-name"));
//		
		
		
		driver.close();
	}

}
