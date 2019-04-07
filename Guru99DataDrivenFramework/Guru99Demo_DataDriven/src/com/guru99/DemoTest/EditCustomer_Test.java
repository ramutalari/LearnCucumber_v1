package com.guru99.DemoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.guru99.DemoScreen.EditCustomer_Screen;
import com.guru99.DemoScreen.NewCustomerScreen;

public class EditCustomer_Test extends SuperClass
{	
	@Test()
	public void EditCustomer() throws Exception 
	{
		EditCustomer_Screen EditCustomer_Screen = new EditCustomer_Screen(driver);
		NewCustomerScreen NewCustomerScreen = new NewCustomerScreen(driver);
				
		File source = new File("./TestData/TestData_NewCustomer.xlsx");
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int LastRow = sheet.getLastRowNum();		
			
		XSSFCell CustomerID = sheet.getRow(1).getCell(11);
			
			EditCustomer_Screen.EditCustomer().click();
			Thread.sleep(1000);
			
			EditCustomer_Screen.CustomerID().sendKeys(CustomerID.getStringCellValue());
			EditCustomer_Screen.Submit().click();
			Thread.sleep(1000);
			
			//XSSFCell CustomerName =sheet.getRow(1).getCell(1);
			
			String Updated_MobileNumber = "998412011756";
			NewCustomerScreen.MobileNumber().clear();			
			NewCustomerScreen.MobileNumber().sendKeys(Updated_MobileNumber);			
			EditCustomer_Screen.Submit().click();
			
			String UpdatedMsg = EditCustomer_Screen.DetailsupdatedMsg().getText();			
			Assert.assertEquals(UpdatedMsg, "Customer details updated Successfully!!!");
			System.out.println(UpdatedMsg);		
						
		/*	//To take screenshots
			TakesScreenshot ts = (TakesScreenshot)driver;
			 source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+Updated_MobileNumber+".png"));
			System.out.println("Screenshot taken");		*/		
									
			Thread.sleep(1500);
			
			//To write the details into Excel sheet			
			// Create cell where data needs to be written.
			   sheet.getRow(1).createCell(12).removeCellComment();
			   Thread.sleep(500);
			   sheet.getRow(1).createCell(12).setCellValue(UpdatedMsg);
		
			// Specify the file in which data needs to be written.
			   FileOutputStream fileOutput = new FileOutputStream(source);
			// finally write content		   
			   workbook.write(fileOutput);
			// close the file		   
			 //fileOutput.close();	 					    
			   Thread.sleep(1000);
			   NewCustomerScreen.Home().click();				
	}
}