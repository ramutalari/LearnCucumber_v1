package com.guru99.DemoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.guru99.DemoScreen.NewCustomerScreen;

public class NewCustomerTest extends SuperClass
{	
	@Test()
	public void AddNewCustomer() throws Exception
	{
		Thread.sleep(2000);
		NewCustomerScreen newcustomer = new NewCustomerScreen(driver);
		newcustomer.NewCustomer().click();		
		Thread.sleep(2000);
		File source = new File("./TestData/TestData_NewCustomer.xlsx");		
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);		
		int LastRow = sheet.getLastRowNum();	
		System.out.println(LastRow);		
		// Write data in the excel.		
		FileOutputStream fout = new FileOutputStream(source);				
		for(int i=1;i<=LastRow;i++)
		{			
			XSSFCell CustomerName =sheet.getRow(i).getCell(1);
			XSSFCell DOB = sheet.getRow(i).getCell(2);
			XSSFCell Address = sheet.getRow(i).getCell(3);
			XSSFCell City = sheet.getRow(i).getCell(4);
			XSSFCell State = sheet.getRow(i).getCell(5);
			XSSFCell PIN = sheet.getRow(i).getCell(6);	
			XSSFCell MobileNumber = sheet.getRow(i).getCell(7);
			XSSFCell Email = sheet.getRow(i).getCell(8);
			XSSFCell Password = sheet.getRow(i).getCell(9);
			
			newcustomer.CustomerName().sendKeys(CustomerName.getStringCellValue());
			newcustomer.DateOfBirth().sendKeys(DOB.getStringCellValue());
			newcustomer.Address().sendKeys(Address.getStringCellValue());
			newcustomer.City().sendKeys(City.getStringCellValue());
			newcustomer.State().sendKeys(State.getStringCellValue());
			newcustomer.PIN().sendKeys(PIN.getStringCellValue());
			newcustomer.MobileNumber().sendKeys(MobileNumber.getStringCellValue());
			newcustomer.Email().sendKeys(Email.getStringCellValue());	
			newcustomer.Password().sendKeys(Password.getStringCellValue());			
			Thread.sleep(3000);
			newcustomer.Submit_Button().click();
					
			//To take screenshots
			TakesScreenshot ts = (TakesScreenshot)driver;
			 source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+CustomerName+".png"));
			System.out.println("Screenshot taken");				
			
			String RegisterdMsg = newcustomer.RegisteredMsg().getText();		
			Assert.assertEquals("Customer Registered Successfully!!!", RegisterdMsg);
			System.out.println(RegisterdMsg);		
			
			Thread.sleep(2000);
			
			//To write the details into Excel sheet
			
			// Create cell where data needs to be written.
			   sheet.getRow(i).createCell(10).removeCellComment();
			   Thread.sleep(500);
			   sheet.getRow(i).createCell(10).setCellValue(RegisterdMsg);
			// Specify the file in which data needs to be written.
			   FileOutputStream fileOutput = new FileOutputStream(source);
			// finally write content		   
			   workbook.write(fileOutput);
			// close the file		   
			 //fileOutput.close();	 					    
			   Thread.sleep(1000);
			   newcustomer.Home();
			   Thread.sleep(1500);
			   newcustomer.NewCustomer().click();						   			
		}		
	}
}