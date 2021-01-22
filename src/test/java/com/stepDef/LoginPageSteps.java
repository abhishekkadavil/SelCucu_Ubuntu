package com.stepDef;

import com.Utils.TestContext;
import com.pageObject.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {

	TestContext testContext;
	LoginPage LoginPage;

	public LoginPageSteps(TestContext context) {
		 testContext = context;
		 LoginPage = testContext.getPageObjectManager().getLoginPage();
		 }

	@When("navigate to login page")
	public void navigate_to_login_page() {
		LoginPage.navigate_to_login_page();
	}

	@And("enter username and password and click login button")
	public void enter_username_and_password_and_click_login_button() {
		LoginPage.userSignin(testdata);
	}

	@Then("user will navigate to account page")
	public void user_will_navigate_to_acoount_page() {

	}

}
