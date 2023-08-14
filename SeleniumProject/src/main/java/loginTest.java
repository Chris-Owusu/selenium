import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Running shoes");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		driver.close();

	}
}
