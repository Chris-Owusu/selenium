package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test
	public void depOnMthd() {
		System.out.println("This is the first output..........");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "depOnMthd")
	public void dependent() {
		System.out.println("This is the dependent output..........");
	}
	
	
	@Test(dependsOnMethods = "depOnMthd", alwaysRun=true)
	public void secondDependant() {
		System.out.println("This is the second dependant output..........");
	}

}
