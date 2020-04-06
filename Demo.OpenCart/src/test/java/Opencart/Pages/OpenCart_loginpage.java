package Opencart.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Opencart_Basepage;

public class OpenCart_loginpage extends Opencart_Basepage {

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myaccount;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(id = "input-email")
	WebElement usernameweb;
	@FindBy(id="input-password")
	WebElement passwordweb;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	
	public OpenCart_loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public void opencart_login() {
		 myaccount.click();
		 login.click();
	}

	public void username(String username) {
		usernameweb.sendKeys(username);
	}

	public void password(String password) {

		passwordweb.sendKeys(password);
	}

	public void loginbtn() {

		loginbtn.click();
	}
	
	}