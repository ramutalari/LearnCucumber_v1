/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsQAStepDefinition
{	
	WebDriver driver;
		
	@Before
	public  void preSetup()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();		
	}
	
	@After
	public void endSetup()
	{
		driver.quit();
	}
	
	@Given("^I want to write some steps on toolsqa$")
	public void i_want_to_write_some_steps_on_toolsqa() throws Throwable 
	{
	    driver.get("https://www.toolsqa.com/automation-practice-form/");
	    driver.manage().window().maximize();
	}

	@When("^I enter firstname and lastname$")
	public void i_enter_firstname_and_lastname() throws Throwable
	{
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		  firstName.sendKeys("Sachin");
		  lastName.sendKeys("Tendulkar");	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable 
	{
		System.out.println("firstname and lastname are displaying");
	}	
}*/