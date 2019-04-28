package com.RunnerClass;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		features="C:\\Users\\name\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\Feature",
		glue= {"com.stepDefinition"},
		format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true
		
		
		
		)






public class TestRunner {

	 @AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("C:\\Users\\name\\eclipse-workspace\\Cucumber\\extent-config.xml"));
	 }
	
	
}
