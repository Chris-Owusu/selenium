package utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUtils {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jestjs.io/docs/using-matchers");
		
		
		 LocalDateTime currDate = LocalDateTime.now();
		System.out.println(currDate);
		String screenshotTime = currDate.toString().replace(" ", "-").replace(":", "-").replace(".", "-");
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenhot/screen.png"));
		
		
		driver.close();
	}

}
