package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepImplementations 
{
	@Given("^the user launched the app url in the browser$")
	public void the_user_launched_the_app_url_in_the_browser() throws Throwable {
	System.out.println("the user launched the app url in the browser");	
	}

	@Given("^the login page details are displayed$")
	public void the_login_page_details_are_displayed() throws Throwable {
		System.out.println("the login page details are displayed");
	}

	@When("^the user enters the value for the username field$")
	public void the_user_enters_the_value_for_the_username_field() throws Throwable {
		System.out.println("the user enters the value for the username field");
	}

	@When("^the user enters the value for the password field$")
	public void the_user_enters_the_value_for_the_password_field() throws Throwable {
		System.out.println("the user enters the value for the password field");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable
	{
		System.out.println("clicks on login button");
	}

	@Then("^the user should be redirected to the home page$")
	
	public void the_user_should_be_redirected_to_the_home_page() throws Throwable 
	{
		System.out.println("the user should be redirected to the home page");
	}

}
