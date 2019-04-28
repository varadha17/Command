package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class LoginPage extends Base {

	public LoginPage() throws Exception {
		super();
	
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id="identifierId")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	public HomePage Login() throws Exception {
		
		username.sendKeys("abinash.varadharajan@gmail.com");
		username.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		password.sendKeys("badriabi");
		password.click();
		
		Thread.sleep(2000);
		
		return new HomePage();
		
		
	}
	
	
	
	
	
	
}
