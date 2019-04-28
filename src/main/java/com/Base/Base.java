package com.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public Base() throws Exception {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\name\\eclipse-workspace\\Cucumber\\src\\main\\java\\Config\\properties\\config.properties");
		prop.load(fis);
		
	}

	
	public static void start() {
		
		String s = prop.getProperty("browser");
		
		if(s.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\sel chrome driver\\chromedriver_win32\\chromedriver.exe");
		
			driver = new ChromeDriver();
		
		
		}else {
			System.out.println("No browser");
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}
	
}
