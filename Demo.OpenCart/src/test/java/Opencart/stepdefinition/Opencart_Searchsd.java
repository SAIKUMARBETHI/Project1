package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.Opencart_Searchpage;
import baseclass.Opencart_Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Screenshot;

public class Opencart_Searchsd extends Opencart_Basepage{
		Opencart_Searchpage search;
		final static Logger logger=LogManager.getLogger(Opencart_Searchsd.class.getName());	
		
		 @Given("^launch the browser$")
		    public void launch_the_browser() throws Throwable {
			 launchBrowser();   
			 logger.info("browser opens");
		    }

		    @When("^the user opens the opencart search page$")
		    public void the_user_opens_the_opencart_search_page() throws Throwable {
		    	 search= new Opencart_Searchpage(driver);
		         search.searchbox();
		    	search. opencart_search("IMAC");
		    	logger.debug("product opened");
		       
		    }

		    @Then("^the user search the product$")
		    public void the_user_search_the_product() throws Throwable {
		    	 search= new Opencart_Searchpage(driver);
			        search.button();
			        logger.info("product searched");
		        
		    }

		    @Then("^the user close the search page$")
		    public void the_user_close_the_search_page() throws Throwable {
		    
		    	Screenshot util = new  Screenshot(driver);
				util.takeSnapShot("E:\\javas\\Demo.OpenCart\\src\\test\\resources\\screenshot\\searchPage.png");
				 logger.error("browser is closed");
				  driver.close();
		      
		       
		    }


}
