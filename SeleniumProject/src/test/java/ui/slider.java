package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 400, 100).perform();
		
		// right click
		action.contextClick().perform();
		
		driver.close();
	}

}
