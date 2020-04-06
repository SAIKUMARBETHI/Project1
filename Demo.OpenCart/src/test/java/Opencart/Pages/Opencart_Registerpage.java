package Opencart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.Opencart_Basepage;

public class Opencart_Registerpage extends Opencart_Basepage {

		@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
		WebElement myaccount;
		@FindBy(linkText = "Register")
		WebElement register;
		@FindBy(id = "input-firstname")
		WebElement firstname;
		@FindBy(id="input-lastname")
		WebElement lastname;
		@FindBy(id = "input-email")
		WebElement usernameweb;
		@FindBy(id = "input-telephone")
		WebElement telephone;
		@FindBy(id="input-password")
		WebElement passwordweb;
		@FindBy(id="input-confirm")
		WebElement confirm;
		@FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
		WebElement agree;
		@FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
		WebElement ctn;
		@FindBy(xpath="//*[@id='content']/div/div/a")
		WebElement ctn1;
	
		
		
		

		
		public Opencart_Registerpage(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}
		public void opencart_login() {
			 myaccount.click();
			 register.click();
		}

		public void firstname(String username) {
			firstname.sendKeys(username);
			
		}
		public void lastname(String username2) {
			lastname.sendKeys(username2);
			
		}
		public void usernameweb(String mail) {
			usernameweb.sendKeys(mail);
			
		}


		public void telephonenum(String number) {

			telephone.sendKeys(number);
		}

		public void password(String password) {

			passwordweb.sendKeys(password);
		}
	
		public void confirmpass(String password1) {

			confirm.sendKeys(password1);
		}
		public void agree() {
			agree.click();
			
		}

		public void ctn() {

			ctn.click();
		}
		public void ctn1() {

			ctn1.click();
		}
		
		

}
