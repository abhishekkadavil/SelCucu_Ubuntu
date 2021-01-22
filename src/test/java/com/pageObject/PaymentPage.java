package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Log;

public class PaymentPage {
	
	WebDriver driver;
	
	public PaymentPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class='bankwire']")
	private WebElement payment_PayByBank;
	
	@FindBy(how = How.XPATH, using = "//a[@class='cheque']")
	private WebElement payment_PayByCheck;
	
	@FindBy(how = How.XPATH, using = "//button[@class='button btn btn-default button-medium']")
	private WebElement payment_confirmorderBtn;
	
	public void select_PayByBank()
	{
		Log.info("PaymentPage: select pay by bank");
		payment_PayByBank.click();
	}
	
	public void select_PayByCheck()
	{
		Log.info("PaymentPage: select pay by check");
		payment_PayByCheck.click();
	}
	
	public void click_ConfirmOrderBtn()
	{
		Log.info("PaymentPage: click confirm order");
		payment_confirmorderBtn.click();
	}

}
