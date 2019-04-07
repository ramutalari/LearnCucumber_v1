package com.guru99.DemoScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Bank_LoginScreen 
{	
	WebDriver driver;
	
	public Guru99Bank_LoginScreen(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By UserID = By.xpath("//*[@name='uid']");
	By Password = By.xpath("//*[@name='password']");
	By Login_Button = By.xpath("//*[@value='LOGIN']");
	By Reset_Button = By.xpath("//*[@value='RESET']");
	
	public WebElement UserID()
	{
		return driver.findElement(UserID);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement Login_Button()
	{
		return driver.findElement(Login_Button);
	}
	
	public WebElement Reset_Button()
	{
		return driver.findElement(Reset_Button);
	}	
}