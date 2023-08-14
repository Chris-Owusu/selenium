package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLError2 {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ChromeDriver driver = new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions coOption = new ChromeOptions();
		
		coOption.merge(dc);
		WebDriver driver = new ChromeDriver(coOption);
		
		driver.get("https://jestjs.io/docs/using-matchers");

	}

}
