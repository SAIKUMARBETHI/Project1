package Opencart.stepdefinition;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import Opencart.Pages.OpenCart_loginpage;
import baseclass.Opencart_Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Excelllogin;
import utility.Screenshot;

public class Opencart_loginsd extends Opencart_Basepage {
	
	
	final static Logger logger=LogManager.getLogger(Opencart_loginsd.class.getName());
	Excelllogin data=new Excelllogin();
	OpenCart_loginpage login;

	@Given("^a user launch the browser$")
	public void a_user_launch_the_browser() throws Throwable{
		 
   launchBrowser();
   logger.info("browser opens");
   
}

	@When("^the user opens opencart login page$")
	public void the_user_opens_opencart_login_page() throws Throwable {
   
   login= new OpenCart_loginpage(driver);
  login.opencart_login();
  logger.debug("login page");
}
	 @Then("^the user login using (.+) and (.+)$")
	    public void the_user_login_using_and(String username, String password) throws Throwable {
	    	//login= new OpenCart_loginpage(driver);
		Excelllogin excellogin = new Excelllogin();
    	login.username(excellogin.excel_username(0));
    	login.password(excellogin.excel_password(0));
    	
		logger.info("sucessful login");
	}

	@Then("^the user close the login page$")
	public void the_user_close_the_login_page() throws Throwable  {
		Screenshot util = new  Screenshot(driver);
		util.takeSnapShot("E:\\javas\\Demo.OpenCart\\src\\test\\resources\\screenshot\\loginPage.png");
		logger.error("browser is closed");
		  driver.close();
    
    

}
}
