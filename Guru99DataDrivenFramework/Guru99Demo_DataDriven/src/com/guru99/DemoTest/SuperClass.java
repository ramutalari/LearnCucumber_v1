package com.guru99.DemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.Screenshot;

public class SuperClass
{			
	public static WebDriver driver;	
	
	@Parameters({"browser", "url"})	
	@BeforeTest()
	public void PreConditions(String browser, String url)
	{		
		if(browser.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();			
		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else
		{
			driver = new FirefoxDriver();
		}				
		driver.manage().window().maximize();		
		driver.get(url);			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}		
	@AfterMethod()	
	public void takesScreenshot(ITestResult result) throws Exception 
	{		
		if(ITestResult.SUCCESS==result.getStatus())
		{			
			Screenshot.captureScreenshot(driver, result.getName());
		}
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
		}				
	}	
}