package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest 
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
	
	@Given("^Open chrome and Start application$")
	public void open_chrome_and_Start_application() throws Throwable
	{		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}	
	@When("^I enter valid username and valid password")
	public void I_enter_valid_username_and_valid_password()
	{
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");		
	}
	@Then("^User should be able to login successfully")
	public void User_should_be_able_to_logi_successfully()
	{	  	
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	}
	

}
