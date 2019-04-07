package com.guru99.DemoScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomerScreen 
{	
	WebDriver driver;	
	public NewCustomerScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By NewCustomer = By.xpath(" //*[text()='New Customer']");	
	By CustomerName = By.xpath("//*[@name='name']");
	By DateOfBirth = By.xpath("//*[@id='dob']");
	By Address = By.xpath("//*[@name='addr']");
	By City = By.xpath("//*[@name='city']");
	By State = By.xpath("//*[@name='state']");
	By PIN = By.xpath("//*[@name='pinno']");
	By MobileNumber = By.xpath("//*[@name='telephoneno']");	
	By Email = By.xpath("//*[@name='emailid']");
	By Password = By.xpath("//*[@name='password']");
	By Submit_Button = By.xpath("//*[@value='Submit']");
	By Reset_Button = By.xpath("//*[@value='Reset']");		
	By RegisteredMsg = By.xpath("//*[text()='Customer Registered Successfully!!!']");
	By Home = By.xpath("//*[text()='Home']");
		
	public WebElement NewCustomer()
	{
		return driver.findElement(NewCustomer);
	}
	
	public WebElement CustomerName()
	{
		return driver.findElement(CustomerName);
	}
	
	public WebElement DateOfBirth()
	{
		return driver.findElement(DateOfBirth);
	}
	
	public WebElement Address()
	{
		return driver.findElement(Address);
	}
	
	public WebElement City()
	{
		return driver.findElement(City);
	}
	
	public WebElement State()
	{
		return driver.findElement(State);
	}
	
	public WebElement PIN()
	{
		return driver.findElement(PIN);
	}
	
	public WebElement MobileNumber()
	{
		return driver.findElement(MobileNumber);
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement Submit_Button()
	{
		return driver.findElement(Submit_Button);
	}
	
	public WebElement Reset_Button()
	{
		return driver.findElement(Reset_Button);
	}
	
	public WebElement RegisteredMsg()
	{
		return driver.findElement(RegisteredMsg);		
	}
	
	public WebElement Home()
	{
		return driver.findElement(Home);
	}	
}