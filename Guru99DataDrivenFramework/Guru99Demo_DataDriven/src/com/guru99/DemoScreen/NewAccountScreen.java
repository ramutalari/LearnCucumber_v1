package com.guru99.DemoScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountScreen
{
	WebDriver driver;
	
	public NewAccountScreen(WebDriver driver)
	{
		this.driver = driver;
	}
		
	By NewAccount = By.xpath("//*[text()='New Account']");
	By Customerid = By.xpath("//*[@name='cusid']");
	By AccountType_DD = By.xpath("//*[@name='selaccount']"); 
	By InitialDeposit = By.xpath("//*[@name='inideposit']");
	By Submit = By.xpath("//*[@value='submit']");
	By reset = By.xpath("//*[@value='reset']");
	By Home = By.xpath("//*[text()='Home']");
	
	public WebElement NewAccount()
	{
		return driver.findElement(NewAccount);
	}	
	public WebElement Customerid()
	{
		return driver.findElement(Customerid);
	}
	public WebElement AccountType_DD()
	{
		return driver.findElement(AccountType_DD);
	}
	public WebElement InitialDeposit()
	{
		return driver.findElement(InitialDeposit);
	}
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	public WebElement reset()
	{
		return driver.findElement(reset);
	}
	public WebElement Home()
	{
		return driver.findElement(Home);
	}
}