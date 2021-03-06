package Opencart.stepdefinition;

import Opencart.Pages.Register_OCpage;
import baseclass.Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Registersd extends Basepage {

	Register_OCpage register;

	@Given("^the user launch the browser for valid register$")
	public void the_user_launch_the_browser_for_valid_register() throws Throwable {
		launchBrowser();
	}

	@When("^the  user opens opencart register page$")
	public void the_user_opens_opencart_register_page() throws Throwable {

		register = new Register_OCpage(driver);
		register.OcLogin();
	}

	@Then("^the user enters the valid register details$")
	public void the_user_enters_the_valid_register_details() throws Throwable {
		register = new Register_OCpage(driver);
		register.FirstName("Saikumar");
		register.LastName("bethi");
		register.UserName1("saikumar41@gmail.com");
		register.TelephoneNum("9491993674");
		register.Password("Saikumar8985");
		register.ConfirmPass("Saikumar8985");
		register.Agree();
		register.ctn();
		register.ctn1();
	}

	@Then("^the user close the register page$")
	public void the_user_close_the_register_page() throws Throwable {
		Screenshot util = new Screenshot(driver);
		util.takeSnapShot("src\\test\\resources\\screenshot\\registerPage1.png");
		driver.close();

	}

}
