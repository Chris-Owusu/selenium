package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

import testSuite.beforeSuiteAfterSuite;

public class skipTest extends beforeSuiteAfterSuite {
	
	Boolean userName = true;
	
	@Test(enabled=false)
	public void skip() 
	{
		System.out.println("This is a skip test....");
	}
	
	@Test
	public void skip2() 
	{
		System.out.println("This is a skip test with throws....");
		throw new SkipException("This is the skip exception for the second test...");
	}
	
	@Test
	public void skip3() 
	{
		System.out.println("This is a skip test with if/else....");
		if(userName == false) {
			System.out.println("Third method is passed....");
		}else {
			throw new SkipException("This is the skip exception for the last test......when it fails");
		}
	}

}
