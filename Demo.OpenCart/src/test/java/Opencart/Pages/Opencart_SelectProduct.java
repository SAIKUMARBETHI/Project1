package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Opencart_Basepage;

public class Opencart_SelectProduct extends   Opencart_Basepage{
	
	
	@FindBy(xpath="//*[@id='menu']/div[2]/ul/li[4]/a")
	WebElement tablet;
	@FindBy(xpath="//*[@id='content']/div[2]/div/div/div[2]/div[1]/h4/a")
	WebElement product;
	@FindBy(xpath="//*[@id='button-cart']")
	WebElement cart;

	public Opencart_SelectProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);

	this.driver =driver;

	}
	public void selectProduct() {
	tablet.click();
	product.click();
	}
	public void verify() {
	cart.click();

	}
	

}
