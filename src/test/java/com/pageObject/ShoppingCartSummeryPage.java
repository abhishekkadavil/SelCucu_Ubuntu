package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Log;

public class ShoppingCartSummeryPage {
	
	WebDriver driver;
	
	public ShoppingCartSummeryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//p/a[@title='Proceed to checkout']")
	private WebElement shoppingCartSummeryPage_proceedToCheckout;
	
	public void click_proceedToCheckout()
	{
		Log.info("ShoppingCartSummeryPage: click proceed to checkout");
		shoppingCartSummeryPage_proceedToCheckout.click();
	}

}
