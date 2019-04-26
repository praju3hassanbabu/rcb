package sekeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.util.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class InvlaidScenarioLogin 
{WebDriver driver;
//@Before

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
	@Given("The url of test me app")
	public void the_url_of_test_me_app() {
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters invalid data")
	public void user_enters_invalid_data(DataTable dataTable) {
		
		
		List<List<String>>  list=dataTable.asLists();
		for (List<String> list2 : list) 
		{
			for (String s : list2) 
			{
				System.out.print(s+"\t");
			}
			System.out.println();
		}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}

	@Then("user is in login page")
	public void user_is_in_login_page(List<String> s) {
	    // Write code here that turns the phrase above into concrete actions
		for (String string : s) 
	    {
	    	System.out.println(string);
		}
	}

}
