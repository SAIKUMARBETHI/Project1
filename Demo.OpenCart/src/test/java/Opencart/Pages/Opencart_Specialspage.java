package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Opencart_Basepage;

public class Opencart_Specialspage extends Opencart_Basepage {

	
	
	@FindBy(linkText="Specials")
	WebElement offers;
	@FindBy(xpath="//div[@id='content']/div[2]/div/div/div[2]/div[2]/button/span")
	WebElement Addtocart;
	public Opencart_Specialspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public void Specialoffer() throws InterruptedException {
	   offers.click();
	   Thread.sleep(3000);
   }
   public void AddCart() throws InterruptedException {
	   Addtocart.click();
	   Thread.sleep(3000);
   }
}