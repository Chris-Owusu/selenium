package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dragNdrop {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		
		WebElement drag = driver.findElement(By.cssSelector("#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("#droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		
		driver.close();
	}

}
