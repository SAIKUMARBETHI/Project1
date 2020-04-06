package Opencart.stepdefinition;

import Opencart.Pages.Opencart_Registerpage;
import baseclass.Opencart_Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Opencart_Registersd extends Opencart_Basepage {
	

	Opencart_Registerpage register;
    @Given("^the user launch the browser for valid register$")
    public void the_user_launch_the_browser_for_valid_register() throws Throwable {
    	launchBrowser();
    }

    @When("^the  user opens opencart register page$")
    public void the_user_opens_opencart_register_page() throws Throwable {

 	   register= new Opencart_Registerpage(driver);
 	  register.opencart_login();
    }

    @Then("^the user enters the valid register details$")
    public void the_user_enters_the_valid_register_details() throws Throwable {
    	register= new Opencart_Registerpage(driver);
		register.firstname("Saikumar");
		register.lastname("bethi");
		register.usernameweb("saikumar14@gmail.com");
		register.telephonenum("9491993674");
		register.password("Saikumar8985");
		register.confirmpass("Saikumar8985");
		register.ctn();
    }

    @Then("^the user close the register page$")
    public void the_user_close_the_register_page() throws Throwable {
    	Screenshot util = new  Screenshot(driver);
		util.takeSnapShot("E:\\javas\\Demo.OpenCart\\src\\test\\resources\\screenshot\\RegisterPage.png");
		 driver.close();
      
    }

}
