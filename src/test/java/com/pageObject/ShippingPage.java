package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Log;

public class ShippingPage {
	
	WebDriver driver;
	
	public ShippingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='cgv']")
	private WebElement ShippingPage_termsofserviceCheckBx;
	
	@FindBy(how = How.XPATH, using = "//button[@name='processCarrier']")
	private WebElement ShippingPage_proceedToCheckout;
	
	public void check_TermsOfService()
	{
		Log.info("ShippingPage: check terms of service");
		ShippingPage_termsofserviceCheckBx.click();
	}
	
	public void click_proceedToCheckout()
	{
		Log.info("ShippingPage: click proceed to checkout");
		ShippingPage_proceedToCheckout.click();
	}

}
