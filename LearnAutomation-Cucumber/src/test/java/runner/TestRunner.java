package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/main/resources/", 
		glue={"StepDefination"},
		plugin={"html:target/cucumber-html-report"}
		)

public class TestRunner
{
		

}
