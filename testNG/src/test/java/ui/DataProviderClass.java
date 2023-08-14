package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
//	@DataProvider(name="logIn")
//	public Object[][] dataProvider1()
//	{
//		return new Object[][] 
//		{
//			{"user1", "pass"},
//			{"user2", "pass2"}
//		};
//	}
//
//	@DataProvider
//	public Object[][] dataProvider()
//	{
//		Object[][] obj = new Object[2][2];
//		
//		//user 1
//		obj[0][0] = "userName1";
//		obj[0][1] = "userPassword1";
//		
//		//user 2
//		obj[1][0] = "userName2";
//		obj[1][1] = "userPassword2";
//		
//		return obj;
//	}
	
	@DataProvider(name="logIn")
	public Object[][] dataProviderMerge(Method m)
	{
		Object[][] testdata = null;
		if(m.getName().equals("login"))
		testdata = new Object[][] 
		{
			{"user1", "pass"},
			{"user2", "pass2"}
		};
		else if (m.getName().equals("login1")) {
			testdata = new Object[][] {
				{"user1", "pass"},
				{"user2", "pass2"}
			};
		}
		return testdata;
	}

}
