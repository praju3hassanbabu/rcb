package sekeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDesps 
{
	WebDriver driver;
//	@Before
	public void beforeCucumber()
	{
		driver=DriverUtility.getDriver("chrome");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	}
	//@After
	public void afterCucumber()
	{
		driver.close();
	}
	@Given("The URL of Test Me APP")
	public void the_URL_of_Test_Me_APP() 
	{
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  
	}

	@When("user enter {word} as userName")
	public void user_enter_as_userName(String string) 
	{
		
		
		driver.findElement(By.id("userName")).sendKeys(string);
	}
	// For the data driven testing we use data iteration but here data will be single word so we replace 
	// "string" with "data"
	@When("user enters {word} asn password")
	public void user_enters_asn_password(String string) {
	    driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		Assert.assertTrue(driver.getTitle().contains("Home"));

	}
}
