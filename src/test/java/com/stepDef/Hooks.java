package com.stepDef;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import com.Utils.Log;
import com.Utils.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeScenario(Scenario scenario) {
		/*
		 * What all you can perform here Starting a webdriver Setting up DB connections
		 * Setting up test data Setting up browser cookies Navigating to certain page or
		 * anything before the test
		 */
		//DOMConfigurator.configure("src//test//resources//log4j.xml");
		PropertyConfigurator.configure("src//test//resources//log4j.properties");
		Log.startTestCase(scenario.getName());
		
		/*
		 * We have not started our driver in the @Before method, because we have been
		 * doing the same in the TestContext class constructor. Because our
		 * PageObjectModel needs the driver at the early stage.
		 */
	}

	@After
	public void AfterScenario(Scenario scenario) {
		testContext.getWebDriverManager().closeDriver();
		Log.endTestCase(scenario.getName());
	}

}
