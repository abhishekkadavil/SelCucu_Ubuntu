package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Log;

public class ProductDetailPage {
	
	WebDriver driver;
	
	public ProductDetailPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@name='Submit']")
	private WebElement ProductDetailPage_addToCart;
	
	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default button button-medium']")
	private WebElement ProductDetailPage_proceedToCheckout;
	
	public void click_AddToCart()
	{
		Log.info("ProductDetailPage: click add to cart");
		ProductDetailPage_addToCart.click();
	}
	
	public void click_proceedToCheckout()
	{
		Log.info("ProductDetailPage: click proceed to checkout");
		ProductDetailPage_proceedToCheckout.click();
	}

}
