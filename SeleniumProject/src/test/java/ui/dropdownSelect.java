package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownSelect {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click()
;		WebElement ddown = driver.findElement(By.name("awareness_source_c"));
		Select select = new Select(ddown);
		
		// Selecting a single element
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("YouTube");
		Thread.sleep(2000);
		select.selectByVisibleText("YouTube");
		
		
		
		driver.close();
	}

}
