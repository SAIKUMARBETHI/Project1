package Opencart.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import baseclass.Opencart_Basepage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/feature/DemoOpencart.feature",
					plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
			"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			//plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc04_Special"},
			glue = {"Opencart.stepdefinition"},
			//monochrome = true
			dryRun=false
			)

	public class Opencart_runner {
		 @AfterClass
	     public static void extendReport()
	   {
	       Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
	       Reporter.setSystemInfo("user", System.getProperty("user.name"));
	       Reporter.setSystemInfo("os", "Windows");
	       Reporter.setTestRunnerOutput("Sample test runner output message");
	   }
	}

