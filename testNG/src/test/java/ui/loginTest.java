package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testSuite.beforeSuiteAfterSuite;

public class loginTest extends beforeSuiteAfterSuite {
	
	@BeforeTest
	public void brfTest()
	{
		System.out.println("This is the before test");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("This is the after test");
	}
	
	@BeforeMethod
	public void brfMethod() 
	{
		System.out.println("This is the before method test");
	}
	
	@AfterMethod
	public void aftMethod() 
	{
		System.out.println("This is the after method test");
	}
	
	@Test(priority=2, description="this is b login")
	public void bloginTest() 
	{
		
		System.out.println("login B");
	}
	
	@Test(priority=1, description="this is  login")
	public void aloginTest() 
	{
		
		System.out.println("login A");
	}

}
