package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class resizable {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 300, 100).perform();
		
		
		
		driver.close();
	}

}
