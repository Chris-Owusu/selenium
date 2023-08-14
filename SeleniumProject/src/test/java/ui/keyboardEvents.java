package ui;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardEvents {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://gitinspired-rw-api.amalitech-dev.net/api/docs/#/");
		driver.manage().window().maximize();
		
		WebElement title = driver.findElement(By.cssSelector(".title"));
		
//		Actions action = new Actions(driver);
//		action.keyDown(title, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		
//		implicit Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn authorize unlocked"))).click();
		
		// Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("Pulling")
//				.ignoring(NoSuchElementException.class);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn authorize unlocked"))).click();
				
//		driver.close();
	}

}
