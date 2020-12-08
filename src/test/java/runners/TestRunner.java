package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/resources/features/",
	glue = {"stepDefinitions"},
 	plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
 			 "junit:target/cucumber-reports/Cucumber.xml"},
 	monochrome = true,
 	tags = "@all"
 )
public class TestRunner {
}
