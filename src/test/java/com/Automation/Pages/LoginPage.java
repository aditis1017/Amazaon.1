package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement login;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement emailid;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement conti;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password1;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	
	
	
	public void Login()
	{ 
		login.click();
	}
	
	public void Email(String str) 
	{
		emailid.sendKeys(str);
	}
	
	public void Contt()
	{
		conti.click();
	}
	
	public void EnterPassword(String str)
	{
		password1.sendKeys(str);
	}
	
	public void Signin() {
		signin.click();
	}

}
