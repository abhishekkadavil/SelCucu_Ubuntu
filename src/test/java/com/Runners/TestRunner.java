package com.Runners;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		dryRun = false,
		glue = {"com.stepDef"},
		tags = "@loginTest",
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 monochrome = true
		)
public class TestRunner {
	
	@BeforeClass
    public static void Setup() {
                    // loading log4j.xml file
    }
	
	@AfterClass
	 public static void writeExtentReport() {
	 
	 }
	
}
