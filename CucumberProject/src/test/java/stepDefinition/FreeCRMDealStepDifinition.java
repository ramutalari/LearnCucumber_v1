/*package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMDealStepDifinition
{	
	WebDriver driver;
	
	@Before
	public void preSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();			
	}	
	
	@Given("^I am on freecrm page to check deals$")
	public void i_am_on_freecrm_page()
	{
		driver.get("https://freecrm.com/");	 
		driver.manage().window().maximize();
	}
	
	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password(DataTable table) throws Throwable
	{
		List<List<String>> data =table.raw();
		
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@name='email']")).sendKeys(data.get(1).get(0));
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys(data.get(1).get(1));
	    driver.findElement(By.xpath("//*[text()='Login']")).click();
	}
	
	@Then("^login should be successfully happen$")
	public void login_should_be_successfuly_happen() throws Throwable 
	{
	    String Title = driver.getTitle();
		System.out.println("FreeCRM title is:"+Title);	    
	}
	
	@And("^I check title of crmpage$")
	public void i_check_title_of_crm_page() throws Throwable
	{
	    System.out.println("successfully logged into freecrm");		
	}
	
	@Then("^I click on Deal and enter required details$")
	public void I_click_on_Deal_and_enter_required_details(DataTable datadeal) throws Throwable 
	{		
		Thread.sleep(4000);
		List<List<String>>  dataDeals= datadeal.raw();
		
		
		 WebElement Deals = driver.findElement(By.xpath("//*[text()='Deals']"));
	     Deals.click();
	     
	     WebElement New = driver.findElement(By.xpath("//*[@class='edit icon']"));
	     New.click();	     
	     
	     WebElement TitleFiled = driver.findElement(By.xpath("//*[@name='title']"));
	     TitleFiled.sendKeys(dataDeals.get(1).get(0));
	     
	     WebElement Description = driver.findElement(By.xpath("//*[@name='description']"));
	     Description.sendKeys(dataDeals.get(1).get(1));
	     
	     WebElement probability = driver.findElement(By.xpath("//*[@name='probability']"));
	     probability.sendKeys(dataDeals.get(1).get(2));
	     
	     WebElement Save = driver.findElement(By.xpath("//*[@class='ui linkedin button']"));
	     Save.click();	     		
	}
	
	@Then("^all details should be stored$")
	public void all_details_should_be_stored() throws Throwable 
	{	    
		System.out.println("All Deals details are stored successfully");
	}	
	
	
	
}*/