package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestionDropdown {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]//parent::li")).click();
//		Thread.sleep(2000);
		WebElement auto = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
		auto.sendKeys("com");
		auto.sendKeys(Keys.ARROW_DOWN);
		auto.sendKeys(Keys.ENTER);
		
		// with handling iframes, you use switchTo() and to switch back to the parent frame use switchTo().parentFrame
		// with handling alert, you use switchTo(). to accept you use the accept() and to deny you use the desmise()
//		Alert nameOfAlert = driver.switchTo().alert();
//		nameOfAlert.sendKeys("qwerty");
		
		
		driver.close();
	}

}
