package com.guru99.DemoTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.guru99.DemoScreen.NewAccountScreen;

public class NewAccountTest extends SuperClass
{
	@Test()
	public void NewAccountCreation() throws Exception
	{
		NewAccountScreen NewAccountScreen = new NewAccountScreen(driver);
		// To click on NewAccount
		NewAccountScreen.NewAccount().click();
		Thread.sleep(1000);		
		
		File source = new File("./TestData/NewAccount.xlsx");
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Thread.sleep(1000);
		int LastRow = sheet.getLastRowNum();
		XSSFCell Kohli_Customerid = sheet.getRow(1).getCell(1);
		XSSFCell Dhone_Customerid = sheet.getRow(2).getCell(1);
		XSSFCell Kedar_Customerid = sheet.getRow(3).getCell(1);
		XSSFCell Rayudu_Customerid = sheet.getRow(4).getCell(1);
		
		
		NewAccountScreen.Customerid().sendKeys(Kohli_Customerid.getStringCellValue());

		WebElement AccountTypeDD = NewAccountScreen.AccountType_DD();
		Select sel = new Select(AccountTypeDD);
		sel.selectByIndex(1);
		NewAccountScreen.InitialDeposit().sendKeys("25000");
		NewAccountScreen.Submit().click();
	}
}