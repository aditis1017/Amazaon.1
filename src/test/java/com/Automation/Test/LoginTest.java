package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest{
@Test
	
	public void VerifysuccessfulLogin()
	{
	DriverUtils.getDriver().get("https://www.amazon.in/");
	LoginPage lp=new LoginPage();
	lp.Login();
	lp.Email("username");
	lp.Contt();
	lp.EnterPassword("password");
	lp.Signin();
	}

}
