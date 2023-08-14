package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="dataProvider",  dataProviderClass=DataProviderClass.class)
	public void login(String username, String password)
	{
		System.out.println(username +"====="+ password);
	}
	
	@Test(dataProvider="logIn", dataProviderClass=DataProviderClass.class)
	public void login1(String user, String pass)
	{
		System.out.println(user +"====="+ pass);
	}
//	
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
}
