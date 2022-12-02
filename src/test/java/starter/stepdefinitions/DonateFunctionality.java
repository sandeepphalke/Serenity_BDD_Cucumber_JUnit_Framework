package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CommonPage;
import pages.DonatePage;
import pages.HomePage;

public class DonateFunctionality {
	
	@Steps
	HomePage home;
	
	@Steps
	DonatePage donate;
	
	@Steps
	CommonPage common;
	
	@Given("User is on home page of UNICEF website")
	public void user_is_on_home_page_of_unicef_website() {
	    
	    home.open();
	}

	@When("User click on the donate button")
	public void user_click_on_the_donate_button() {
		
		home.clickOnDonateButton();
	}

	@Then("User is navigated to donation page")
	public void user_is_navigated_to_donation_page() throws InterruptedException {
	    
		Thread.sleep(15000);
	    donate.verifyPage("The urgent action we take today can prevent the COVID-19 pandemic from becoming a lasting crisis for children, especially the most vulnerable. | UNICEF Global");
	}

	@When("User click on donate button")
	public void user_click_on_donate_button() {
	    
	    common.clickButton("Next");
	}

	@Then("User select other option")
	public void user_select_other_option() {
	    
	    donate.selectOtherOption();
	}
	
	@Then("User enter {string} value")
	public void user_enter_value(String string) {

		donate.enterAmount(string);
	}


	@When("User click on next button")
	public void user_click_on_next_button() {
	    
		common.clickButton("Next");
	}


	@Then("User get an {string} error message")
	public void user_get_an_error_message(String expectedError) {
	  
		common.validateError(expectedError);
	}
	
	@When("User click on the become a donar button")
	public void user_click_on_the_become_a_donar_button() {
		
		home.clickOnBecomeADonarButton();
	}

}
