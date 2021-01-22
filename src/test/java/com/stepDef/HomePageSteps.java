package com.stepDef;

import com.Managers.FileReaderManager;
import com.Utils.TestContext;
import com.pageObject.HomePage;

import io.cucumber.java.en.Given;

public class HomePageSteps extends BaseClass {

	TestContext testContext;
	HomePage HomePage;

	public HomePageSteps(TestContext context) {
		testContext = context;
		HomePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("user is on home page and have testdata as {string}")
	public void user_is_on_home_page_and_have_testdata_as(String id) {
		testdata=FileReaderManager.getInstance().getJsonReader().getTestDataByID(id);
		HomePage.navigateTo_HomePage();
	}

}
