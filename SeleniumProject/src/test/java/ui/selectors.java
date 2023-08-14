package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectors {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).clear();
		System.out.println(driver.findElement(By.name("user-name")).getAttribute("class"));
		System.out.println(driver.findElement(By.name("login-button")).getCssValue("text"));
		System.out.println(driver.findElement(By.name("user-name")).getLocation());
		System.out.println(driver.findElement(By.name("user-name")).getSize());
		System.out.println(driver.findElement(By.name("user-name")).getTagName());
		System.out.println(driver.findElement(By.name("user-name")).isDisplayed());
		System.out.println(driver.findElement(By.name("user-name")).isEnabled());
		System.out.println(driver.findElement(By.name("user-name")).isSelected());
		
		
		driver.close();
	}

}
