package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSSLError {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
			
			ChromeOptions coption = new ChromeOptions();
			coption.merge(dc);
			driver = new ChromeDriver(coption);
		}else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			dc.setAcceptInsecureCerts(true);
			dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			FirefoxOptions firefoxD = new FirefoxOptions();
			firefoxD.merge(dc);
			driver= new FirefoxDriver(firefoxD);
		}else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			dc.setAcceptInsecureCerts(true);
			dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			EdgeOptions edgeD = new EdgeOptions();
			edgeD.merge(dc);
			driver= new EdgeDriver(edgeD);
		}
		
		
		
		
		driver.get("https://jestjs.io/docs/using-matchers");

	}

}
