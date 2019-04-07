package StepDefination;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsQAStepDefinition
{	
	WebDriver driver;	
	WebElement firstName = driver.findElement(By.name("firstname"));
	WebElement lastName = driver.findElement(By.name("lastname"));
	
	@Before
	public void preSetUp() throws Exception
	{
		Thread.sleep(1000);		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}	
	
	@Given("^I want to play with ToolsQA website$")
	public void i_want_to_play_with_ToolsQA_website() throws Throwable
	{		
	    driver.get("https://www.toolsqa.com/automation-practice-form/");
	}

	@When("^I enter first_name and last_name$")
	public void i_enter_firstname_and_lastname() throws Throwable
	{	  
	  Thread.sleep(1000);
	  firstName.sendKeys("Sachin");
	  lastName.sendKeys("Tendulkar");	  
	}

	@Then("^I should be able to see text on those fields$")
	public void i_should_be_able_to_see_text_on_those_fields() throws Throwable
	{		
		String firstNameText = firstName.getText();
	    String lastNameText = lastName.getText();
	        	    
	    Assert.assertEquals(firstNameText, "Sachin");
	    Assert.assertEquals(lastNameText, "Tendulkar");	    
	}
}