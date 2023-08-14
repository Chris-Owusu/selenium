package testSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforeSuiteAfterSuite {
	
	@BeforeSuite
	public void brfSuite() 
	{
		System.out.println("This is the setup....");
	}

	@AfterSuite
	public void aftSuite() 
	{
		System.out.println("This is the cleanup....");
	}
}
