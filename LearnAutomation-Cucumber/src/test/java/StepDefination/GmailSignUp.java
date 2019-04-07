package StepDefination;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailSignUp 
{
	WebDriver driver;	
	
	@Before
	public void PreConditions()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();		
	}
	
	/*@After
	public void afterExecution()
	{
		driver.quit();
	}*/

	@Given("^I am on user registration page$")
	public void i_am_on_a_new_user_registration_page() throws Throwable 
	{		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");			
	}

	@When("^I enter valid data on the page$")
	public void i_enter_valid_data_on_the_page(DataTable table) throws Throwable 
	{    
		List<List<String>> data = table.raw();
		Thread.sleep(2000);
		WebElement FirstName = driver.findElement(By.xpath("//*[@name='firstName']"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement UserName = driver.findElement(By.name("Username"));
		WebElement Password = driver.findElement(By.name("Passwd"));
		WebElement ConfirmPassword = driver.findElement(By.name("ConfirmPasswd"));
		Thread.sleep(2000);
		FirstName.sendKeys(data.get(1).get(1));
		lastName.sendKeys(data.get(2).get(1));
		UserName.sendKeys(data.get(3).get(1));
		Password.sendKeys(data.get(4).get(1));
		ConfirmPassword.sendKeys(data.get(5).get(1));	
	}

	@Then("^the user registration should be successful$")
	public void the_user_registration_should_be_successful() throws Throwable
	{    
		System.out.println("User Registration successfully completed");	
		//Assert.assertFalse(true);
	}
}