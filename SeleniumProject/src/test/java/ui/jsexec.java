package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class jsexec {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();		
		
		JavascriptExecutor jsexec = (JavascriptExecutor) driver;
		
		
		String script = "return document.title;";
		String title = (String) jsexec.executeScript(script);
		System.out.println(title);
		
		WebElement frame = driver.findElement(By.cssSelector("#iframeResult"));
		
		driver.switchTo().frame(frame);
		jsexec.executeScript("myFunction()");
		
		driver.switchTo().alert().accept();
		
		// highlight button
		WebElement btn = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		jsexec.executeScript("arguments[0].style.border='3px solid red'", btn);
		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement learnMore = driver.findElement(By.xpath("//*[@id=\"main\"]/div[11]/div/a"));
		jsexec.executeScript("argument[0].scrollIntoView(true);", learnMore);
		
		
		driver.close();
		
		
	}

}
