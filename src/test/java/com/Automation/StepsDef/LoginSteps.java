package com.Automation.StepsDef;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage lp=new LoginPage();
//	@Given("Open the browser")
//	public void open_the_browser() {
//		DriverUtils.getDriver().get("https://www.amazon.in/");
//	}
	
	@Given("open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("https://www.amazon.in/");
	}
	
	@When("enter Username  {string} and Password  {string}")
	public void enter_username_and_password(String string, String string2) {
		lp.Login();
		
		lp.Email(PropertyReader.getProperty(string));
	    lp.Contt();
	    lp.EnterPassword(PropertyReader.getProperty(string2));
	    lp.Signin();
	}
	

//	@When("Enter valid {string} and {string}")
//	public void enter_valid_and(String string, String string2) throws InterruptedException {
//		lp.Login();
//		
//		lp.Email(PropertyReader.getProperty(string));
//	    lp.Contt();
//	    lp.EnterPassword(PropertyReader.getProperty(string2));
//	    lp.Signin();
//	}
	
	@Then("execute successfull")
	public void execute_successfull() {
		System.out.println("Done");
	}
	
//	@When("enter Username  {string} and Password  {string}")
//	public void enter_username_and_password(String string, String string2) {
//		
//	}
	
	
//
//	@Then("execute successfully")
//	public void execute_successfully() {
//	    System.out.println("Execution done");
//	}


}
