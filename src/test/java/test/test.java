package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.DataProviders.ConfigFileReader;

public class test {
	private static WebDriver driver;

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek.kadavil@gmail.com");
			 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("3@Akmaster");
			 driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.navigate().to("http://automationpractice.com/index.php?id_product=1&controller=product");
			 driver.findElement(By.xpath("//button[@name='Submit']")).click();
			 driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
			 
			 driver.findElement(By.xpath("//p/a[@title='Proceed to checkout']")).click();
			 
			 driver.findElement(By.xpath("//button[@name='processAddress']")).click();
			 
			 driver.findElement(By.xpath("//input[@id='cgv']")).click();
			 driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			 
			 driver.findElement(By.xpath("//a[@class='bankwire']")).click();
			 driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
			 driver.quit();

		
		
		
	}

}
