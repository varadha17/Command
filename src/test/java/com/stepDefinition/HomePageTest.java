package com.stepDefinition;

import org.testng.annotations.Listeners;

import com.Base.Base;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Utilities.TestNGListener;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

@Listeners(TestNGListener.class)
public class HomePageTest extends Base {

	public LoginPage login;
	public HomePage home;
	
	public HomePageTest() throws Exception {
		super();
		
	}
	
	@Before("@Second")
	public void setup() throws Exception {
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
	}

	
	@Given("^Signout the page$")
	public void Signout_the_page() throws Throwable {
	    
		home.userlogo();
		
		
	}
	
	@After("@Second")
	public void teardown() {
		
	driver.quit();	
	}
	
	
	
	
}
