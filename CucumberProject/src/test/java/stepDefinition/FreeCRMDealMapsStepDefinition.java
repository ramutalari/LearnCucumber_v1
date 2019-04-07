/*package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMDealMapsStepDefinition
{

	WebDriver driver;

	@Before
	public void preSetUp() 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^I am on freecrm webpage to check deals details with Map$")
	public void i_am_on_freecrm_page() 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
	}

	@When("^I enter valid username and password with Map$")
	public void i_enter_valid_username_and_password(DataTable table) throws Throwable 
	{
		for (Map<String, String> data : table.asMaps(String.class, String.class))
		{
			driver.findElement(By.xpath("//*[text()='Log In']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(data.get("password"));
			driver.findElement(By.xpath("//*[text()='Login']")).click();
		}
	}

	@Then("^login should be successfully happen with Map$")
	public void login_should_be_successfuly_happen() throws Throwable {
		String Title = driver.getTitle();
		System.out.println("FreeCRM title is:" + Title);
	}

	@And("^I check title of crmpage with Map$")
	public void i_check_title_of_crm_page() throws Throwable
	{
		System.out.println("successfully logged into freecrm");
	}

	@Then("^I click on Deal and enter required details with Map$")
	public void I_click_on_Deal_and_enter_required_details(DataTable datadeal) throws Throwable
	{			
		for (Map<String, String> data : datadeal.asMaps(String.class, String.class)) 
		{
			Thread.sleep(4000);		
			WebElement Deals = driver.findElement(By.xpath("(//*[text()='Deals'])[1]"));
			Deals.click();			
			Thread.sleep(1000);
			WebElement New = driver.findElement(By.xpath("(//*[text()='New'])[1]"));
			New.click();	
			
			WebElement TitleFiled = driver.findElement(By.xpath("//*[@name='title']"));
			TitleFiled.sendKeys(data.get("Title"));

			WebElement Description = driver.findElement(By.xpath("//*[@name='description']"));
			Description.sendKeys(data.get("Description"));

			WebElement probability = driver.findElement(By.xpath("//*[@name='probability']"));
			probability.sendKeys(data.get("Probability"));

			WebElement Save = driver.findElement(By.xpath("//*[@class='ui linkedin button']"));
			
			Save.click();						
						
		}
	}

	@Then("^all details should be stored with Map concept$")
	public void all_details_should_be_stored() throws Throwable {
		System.out.println("All Deals details are stored successfully");
	}
}*/