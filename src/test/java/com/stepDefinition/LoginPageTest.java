package com.stepDefinition;



import org.junit.runner.RunWith;

import com.Base.Base;
import com.Pages.LoginPage;
import com.Utilities.ExtentReporterNG;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class LoginPageTest extends Base {
	
	public LoginPage login;

	public LoginPageTest() throws Exception {
		super();


	}
	
	@Before("@First")
	public void setup() throws Exception {
		
	start();
	
	login = new LoginPage();
		
		
	}
	@Given("^Login the Gmail$")
	public void Login_the_Gmail() throws Throwable {
	   
		login.Login();
		
	}
	
	@After("@First")
	public void teardown() {
		
		driver.quit();
		
	}
	

}
