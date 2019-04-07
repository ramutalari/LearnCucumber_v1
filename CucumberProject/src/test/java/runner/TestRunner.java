package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:/Learn-Automation-Practice/CucumberProject/src/test/resources/TagsDemo.feature", //path of the feature file
		 //path of the stepDefinition file
		glue={"stepDefinition"},
		monochrome = true, //Display the console output in a proper readable format
		dryRun = false, // To check the mapping is proper between feature file and stepdifinition
		strict = true, // it will check is there any step is not defined in stepDefinition
		format ={"pretty", "html:target/cucumber-html-report", "junit:junitreport/cucumber.xml"},
		tags = {"@SmokeTest", "@RegressionTest"}
		)

public class TestRunner
{		

}