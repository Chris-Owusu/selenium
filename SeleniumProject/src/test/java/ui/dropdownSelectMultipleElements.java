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

public class dropdownSelectMultipleElements {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acms.amalitech-dev.net/");
		driver.manage().window().maximize();
		
		// Login
		driver.findElement(By.id("email")).sendKeys("acms@amalitech.org");
		driver.findElement(By.id("password")).sendKeys("Pa@ssword1");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(9000);
		
		// Project section
		driver.findElement(By.xpath("//a[@href='/projects']")).click();Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='Create']//parent::div")).click();
		
		// select options
		WebElement ddown = driver.findElement(By.xpath("//option[text()='Select a skill']//parent::select"));
		Select select = new Select(ddown);
		
		
		Thread.sleep(2000);
		select.selectByValue("aws");
		Thread.sleep(2000);
		select.selectByVisibleText("Flask");
		Thread.sleep(2000);
		select.selectByIndex(3);
		
		List<WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		
		select.deselectByValue("aws");
		List<WebElement> allItems1 = select.getAllSelectedOptions();
		System.out.println(allItems1.size());
		
		
		driver.close();
	}

}
