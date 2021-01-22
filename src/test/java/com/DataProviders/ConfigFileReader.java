package com.DataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.Enums.DriverType;
import com.Enums.EnvType;

public class ConfigFileReader {
	
	private Properties properties;
	//private final String propertyFilePath = "Configs//Config.properties";
	private final String propertyFilePath = "src//test//resources//Config.properties";
	
	public ConfigFileReader() 
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try 
			{
				properties.load(reader);
				reader.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	
	public String getBaseUrl() 
	{
		String url = properties.getProperty("baseURL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getLoginUrl() 
	{
		String url = properties.getProperty("loginURL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getReportConfigPath() 
	{
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	public Boolean getBrowserWindowSize() 
	{
		String windowSize = properties.getProperty("BrowserWindowSize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}
	
	public String getTestDataPath() 
	{
		String reportConfigPath = properties.getProperty("TestDataPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Test data Path not specified in the Configuration.properties file for the Key: TestDataPath");
	}
	
	public String getDriverPath() 
	{
		String testDataResourcePath = properties.getProperty("DriverPath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException(
					"Driver Path not specified in the Configuration.properties file for the Key:DriverPath");
	}
	
	public EnvType getEnvironment() 
	{
		String environmentName = properties.getProperty("environment");
		if (environmentName == null || environmentName.equalsIgnoreCase("local"))
			return EnvType.LOCAL;
		else if (environmentName.equals("remote"))
			return EnvType.REMOTE;
		else
			throw new RuntimeException(
					"Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
	
	public DriverType getBrowser() 
	{
		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException(
					"Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public String getImplicitlyWait() 
	{
		String ImplicitlyWait = properties.getProperty("ImplicitlyWait");
		if (ImplicitlyWait != null)
			return ImplicitlyWait;
		else
			throw new RuntimeException(
					"ImplicitlyWait not specified in the Configuration.properties file for the Key: ImplicitlyWait");
	}

}
