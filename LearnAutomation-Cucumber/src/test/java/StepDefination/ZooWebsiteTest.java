package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZooWebsiteTest 
{
	WebDriver driver;
	
	@Before
	public void PreConditions()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void afterExecution()
	{
		driver.quit();
	}
	
	@Given("^I am on toolsqa website$")
	public void i_am_on_toolsqa_website() throws Throwable 
	{ 		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();		
	}

	@When("^I enter firstname and lastname$")
	public void enterFirstNameAndLastName() throws Throwable 
	{
		driver.findElement(By.name("firstname")).sendKeys("Abhinandan");	
		driver.findElement(By.name("lastname")).sendKeys("WingCommander");
	}
	
	@Then("^firstname and lastname should be displayed$")
	public void dispalyName() throws Throwable 
	{
	  System.out.println("Displaying First Name and Last Name");
	  Thread.sleep(2000);
	}	
	
	@When("^I click on the LinkTest link$")
	public void i_click_on_the_LinkTest_link() throws Throwable 
	{
		driver.findElement(By.xpath("//*[text()='Link Test']")).click();	    
	}

	@Then("^I should be on the Automation Practice Table form$")
	public void i_should_be_on_the_Automation_Practice_Table_form() throws Throwable 
	{
	  Assert.assertTrue("Not on Automation Practice Table page", 
		driver.getTitle().equalsIgnoreCase("Demo Table for practicing Selenium Automation")); 
		//System.out.println(driver.getTitle());		
	}	
}