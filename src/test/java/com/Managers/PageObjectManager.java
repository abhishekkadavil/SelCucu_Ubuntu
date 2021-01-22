package com.Managers;

import org.openqa.selenium.WebDriver;

import com.pageObject.*;

public class PageObjectManager {

	private WebDriver driver;

	private AddressPage AddressPage;
	private CreateAccountPage CreateAccountPage;
	private HomePage HomePage;
	private LoginPage LoginPage;
	private PaymentPage PaymentPage;
	private ProductDetailPage ProductDetailPage;
	private ShippingPage ShippingPage;
	private ShoppingCartSummeryPage ShoppingCartSummeryPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public AddressPage getAddressPage() {
		return (AddressPage == null) ? AddressPage = new AddressPage(driver) : AddressPage;
	}
	
	public CreateAccountPage getCreateAccountPage() {
		return (CreateAccountPage == null) ? CreateAccountPage = new CreateAccountPage(driver) : CreateAccountPage;
	}
	
	public HomePage getHomePage() {
		return (HomePage == null) ? HomePage = new HomePage(driver) : HomePage;
	}
	
	public LoginPage getLoginPage() {
		return (LoginPage == null) ? LoginPage = new LoginPage(driver) : LoginPage;
	}
	
	public PaymentPage getPaymentPage() {
		return (PaymentPage == null) ? PaymentPage = new PaymentPage(driver) : PaymentPage;
	}
	
	public ProductDetailPage getProductDetailPage() {
		return (ProductDetailPage == null) ? ProductDetailPage = new ProductDetailPage(driver) : ProductDetailPage;
	}
	
	public ShippingPage getShippingPage() {
		return (ShippingPage == null) ? ShippingPage = new ShippingPage(driver) : ShippingPage;
	}
	
	public ShoppingCartSummeryPage getShoppingCartSummeryPage() {
		return (ShoppingCartSummeryPage == null) ? ShoppingCartSummeryPage = new ShoppingCartSummeryPage(driver) : ShoppingCartSummeryPage;
	}

}
