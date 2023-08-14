package ui;

import testSuite.beforeSuiteAfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups extends beforeSuiteAfterSuite {
	
	@BeforeClass
	public void bfrClass()
	{
		System.out.println("This is the before class");
	}
	
	@AfterClass
	public void aftClass()
	{
		System.out.println("This is the after class");
	}
	
	@BeforeGroups(value="E2E")
	public void bfrGroup()
	{
		System.out.println("This is the before group");
	}
	
	@AfterGroups
	public void aftGroup()
	{
		System.out.println("This is the after group");
	}
	
	
	
	@Test(groups = "E2E")
	public void bloginTest() 
	{
		
		System.out.println("login B");
	}
	
	@Test(groups = "regression")
	public void aloginTest() 
	{
		
		System.out.println("login A");
	}
	
	@Test(groups = {"regression", "E2E"})
	public void cloginTest() 
	{
		
		System.out.println("login C");
	}
	
	@Test(groups = "performance")
	public void dloginTest() 
	{
		
		System.out.println("login D");
	}
}








