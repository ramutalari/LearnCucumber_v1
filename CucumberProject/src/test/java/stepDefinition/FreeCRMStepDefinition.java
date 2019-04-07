/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMStepDefinition 
{
	WebDriver driver;
	@Before
	public void preSetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();			
	}
	
	@Given("^I am on freecrm webpage$")
	public void i_am_on_freecrm_webpage() throws Throwable
	{
		driver.get("https://freecrm.com/");	 
		driver.manage().window().maximize();
	}
		
	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_valid_and(String username, String password) throws Throwable
	{
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//*[@name='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable 
	{
	    String Title = driver.getTitle();
		System.out.println("FreeCRM title is:"+Title);	    
	}

	@And("^I check title of crm homepage$")
	public void i_check_title_of_crm_homepage() throws Throwable
	{
	    System.out.println("successfully logged into freecrm");		
	}
	
	@Then("^I enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and_and(String firstname, String lastname, String description) throws Throwable 
	{
		Thread.sleep(4000);
		WebElement Contacts = driver.findElement(By.xpath("//*[text()='Contacts']"));		
		Contacts.click();
		Thread.sleep(500);
		WebElement New = driver.findElement(By.xpath("(//*[@class='ui linkedin button'])[3]"));
		New.click();
		Thread.sleep(1000);
		WebElement FirstName = driver.findElement(By.name("first_name"));
		WebElement LastName = driver.findElement(By.name("last_name"));
		WebElement Description = driver.findElement(By.name("description"));
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		Description.sendKeys(description);
		WebElement savebutton = driver.findElement(By.xpath("//*[@class='save icon']"));
		savebutton.click();    
	}

	@Then("^all details stored$")
	public void all_details_stored() throws Throwable 
	{	    
		System.out.println("Details are stored successfully");
	}	
}*/