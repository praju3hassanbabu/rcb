package sekeleton;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class RegistrationDemo {
	WebDriver driver;

	@Before
	public void demo() {
		driver = DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("user enters the url of DemoWebShp")
	public void user_enters_the_url_of_DemoWebShp() {
		driver.get("http://demowebshop.tricentis.com/register");
	}

	
	  @When("user enters the data for registration") public void
	  user_enters_the_data_for_registration() { RegisterPage.gender.click();
	  
	  RegisterPage.FirstName.sendKeys("First");
	  RegisterPage.LastName.sendKeys("Last");
	  RegisterPage.Email.sendKeys("email.ea1mil1188111@gmail.com");
	  RegisterPage.Password.sendKeys("Password123");
	  RegisterPage.ConfirmPassword.sendKeys("Password123");
	  
	  
	  RegisterPage.Register.click(); }
	 

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
		Assert.assertTrue(RegisterPage.message.getText().contains("Your registration completed"));
	}

}
