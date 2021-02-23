package com.stepdef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.Pages.LoginPage;
import com.qa.Factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	//public static WebDriver driver=DriverFactory.getDriver();

	private LoginPage lp=new LoginPage(DriverFactory.getDriver());
	private static String title;
	

@Given("user is on login page")
public void user_is_on_login_page() {
	
	DriverFactory.getDriver().get("https://www.google.com/");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
	title = lp.getLoginPageTitle();
	System.out.println("Page title is: " + title);
	DriverFactory.getDriver().close();
}

@Then("page title should be {string}")
public void page_title_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("forgot your password link should be displayed")
public void forgot_your_password_link_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enters username {string}")
public void user_enters_username(String username) {
    // Write code here that turns the phrase above into concrete actions
   lp.enterUserName(username); 
}

@When("user enters password {string}")
public void user_enters_password(String pwd) {
    // Write code here that turns the phrase above into concrete actions
lp.enterPassword(pwd);
}

@When("user clicks on Login button")
public void user_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user gets the title of the home page")
public void user_gets_the_title_of_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
