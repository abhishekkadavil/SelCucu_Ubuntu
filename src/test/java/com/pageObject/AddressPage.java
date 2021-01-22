package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Log;

public class AddressPage {
	
	WebDriver driver;
	
	public AddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@name='processAddress']")
	private WebElement AddressPage_proceedToCheckout;
	
	public void click_proceedToCheckout()
	{
		Log.info("AddressPage: click proceed to check out");
		AddressPage_proceedToCheckout.click();
	}

}
