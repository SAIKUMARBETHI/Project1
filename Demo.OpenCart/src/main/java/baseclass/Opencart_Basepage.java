package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opencart_Basepage {

public  WebDriver driver;
	
	public void launchBrowser() {
		
		String browser="chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\javas\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "E:\\javas\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");

	
	}

 
	public void quit() {

		driver.close();
	}
}