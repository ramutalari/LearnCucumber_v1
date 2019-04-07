package com.guru99.DemoTest;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.guru99.DemoScreen.Guru99Bank_LoginScreen;

public class Guru99Bank_LoginTest extends SuperClass 
{
	@Test()
	public void Login() throws Exception
	{		
		Guru99Bank_LoginScreen login = new Guru99Bank_LoginScreen(driver);		
		Thread.sleep(2000);		
		File source = new File("./TestData/Login.xlsx");
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);		
		int LastRow = sheet.getLastRowNum();
		
		
		XSSFCell UserID = sheet.getRow(1).getCell(0);
		XSSFCell PASSWORD = sheet.getRow(1).getCell(1);
		
		login.UserID().sendKeys(UserID.getStringCellValue());
		login.Password().sendKeys(PASSWORD.getStringCellValue());
		Thread.sleep(1000);
		login.Login_Button().click();			
		String pageTitle = driver.getTitle();		
		Assert.assertEquals("Guru99 Bank Manager HomePage", pageTitle);				
		System.out.println("Login has been completed successfully");		
	}	
}