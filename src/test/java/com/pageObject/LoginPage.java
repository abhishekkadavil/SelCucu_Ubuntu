package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Managers.FileReaderManager;
import com.TestdataTypes.User;
import com.Utils.Log;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement login_username_email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	private WebElement login_username_password;
	
	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")
	private WebElement login_loginBtn;
	
	public void enter_EmailId(String emailID)
	{
		Log.info("LoginPage: enter user name");
		login_username_email.clear();
		login_username_email.sendKeys(emailID);
	}
	
	public void enter_Password(String Password)
	{
		Log.info("LoginPage: enter password");
		login_username_password.clear();
		login_username_password.sendKeys(Password);
	}
	
	public void click_Submit()
	{
		Log.info("LoginPage: click submit button");
		login_loginBtn.click();
	}
	
	public void userSignin(User testdata)
	{
		Log.info("LoginPage: perform user sign in");
		enter_EmailId(testdata.getLoginCredentail().getUsername());
		enter_Password(testdata.getLoginCredentail().getPassword());
		click_Submit();
	}
	
	public void navigate_to_login_page()
	{
		Log.info("LoginPage: navigate to login page");
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getLoginUrl());
	}

}
