package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//format = {"pretty", "html:target/html/"},
		//format = {"pretty", "json:target/json/"},
		//format = {"pretty", "html:target/html/", "json:target/json/"},
		features={"features"},
		glue={"StepDefination"},
		//tags = {"@FunctionalTest"}
		plugin={"html:target/cucumber-html-report"}
		)

public class GamilSignUpRunner
{

}
