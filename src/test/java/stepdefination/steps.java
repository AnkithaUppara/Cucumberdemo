package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {

		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	  
	 
	}

	@When("User enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password() {
		
		driver.findElement(By.id("email")).sendKeys("abcdwftef");
		driver.findElement(By.id("pass")).sendKeys("123r43");
	    
	  
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
		System.out.println("Error message should displayed");
		Assert.assertTrue(false);
	
	}


}
