package Opencart.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/DemoOpencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc04_Special"},
		glue = {"Opencart.stepdefinition"},
		monochrome = true//readable
		)

public class Specialsrunner {

}
