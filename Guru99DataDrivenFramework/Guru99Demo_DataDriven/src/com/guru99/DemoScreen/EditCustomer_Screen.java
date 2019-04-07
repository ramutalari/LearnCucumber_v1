package com.guru99.DemoScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCustomer_Screen 
{
	WebDriver driver;	
	public EditCustomer_Screen(WebDriver driver)
	{
		this.driver = driver;
	}		
	By EditCustomer = By.xpath("//*[text()='Edit Customer']");
	By CustomerID = By.xpath("//*[@name='cusid']");
	By Submit = By.xpath("//*[@value='Submit']");
	By Reset = By.xpath("//*[@value='Reset']");
	By DetailsupdatedMsg = By.xpath("//*[text()='Customer details updated Successfully!!!']");	
	By Home = By.xpath("//*[text()='Home']");		
	
	public WebElement EditCustomer()
	{
		return driver.findElement(EditCustomer);
	}
	
	public WebElement CustomerID()
	{
		return driver.findElement(CustomerID);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	
	public WebElement Reset()
	{
		return driver.findElement(Reset);
	}
	
	public WebElement DetailsupdatedMsg()
	{
		return driver.findElement(DetailsupdatedMsg);
	}
	
	public WebElement Home()
	{
		return driver.findElement(Home);
	}
	
}
