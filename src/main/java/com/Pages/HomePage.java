package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Base.Base;



public class HomePage extends Base {

	public HomePage() throws Exception {
		super();
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='gb_b gb_hb gb_R']")
	WebElement userlogo;
	
	@FindBy(id="gb_71")
	WebElement signout;
	
	
	public LoginPage userlogo() throws Exception {
		
		userlogo.click();
		
		Thread.sleep(4000);
		
		signout.click();
	
		Thread.sleep(4000);
		
		return new LoginPage();
		
	}
	

}
