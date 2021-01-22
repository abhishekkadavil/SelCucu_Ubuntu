package com.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Managers.FileReaderManager;
import com.Utils.Log;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage()
	{
		Log.info("HomePage: navigate to home page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(
				Integer.parseInt(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()),
				TimeUnit.SECONDS);
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getBaseUrl());
		
		
	}

}
