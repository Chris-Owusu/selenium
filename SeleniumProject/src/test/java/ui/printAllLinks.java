package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printAllLinks {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/documentation/webdriver/elements/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
		
		driver.close();
	}

}
