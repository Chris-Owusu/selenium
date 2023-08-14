//package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DemoAutomation {
	
	public static String browser = "chrome";
	public static WebDriver driver;
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Add/Remove Elements\"]")).click();

	}

}
