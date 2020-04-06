package Opencart.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Opencart.Pages.Opencart_SelectProduct;
import baseclass.Opencart_Basepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.Screenshot;

public class Opencart_selectprodsd  extends Opencart_Basepage{
	Opencart_SelectProduct product;
	final static Logger logger=LogManager.getLogger(Opencart_selectprodsd.class.getName());
	
	@Given("^the user opens the chrome browser$")
    public void the_user_opens_the_chrome_browser() throws Throwable {
		launchBrowser();   
		 logger.info("browser opens");
    }


    @Then("^user select product$")
    public void user_select_product() throws Throwable {
    	product= new Opencart_SelectProduct(driver);
        product.selectProduct();
        logger.debug("product selected");
       
    }

    @Then("^user add the product to cart$")
    public void user_add_the_product_to_cart() throws Throwable {
    	 product.verify();
    	 logger.info("product added");
    }
    
    @Then("^close the opencart page$")
    public void close_the_opencart_page() throws Throwable {
    	Screenshot util = new  Screenshot(driver);
		util.takeSnapShot("E:\\javas\\Demo.OpenCart\\src\\test\\resources\\screenshot\\productPage.png");
		logger.error("page is closed");
		  driver.close();
    }

}
