package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWIndows {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[contains(@class,'card mt-4 top-card')])[3]")).click();
		driver.findElement(By.xpath("(//li[@id='item-0'])[3]")).click();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		driver.close();
	}

}
