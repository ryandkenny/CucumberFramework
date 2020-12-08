package stepDefinitions;
 

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import com.google.common.io.Files;
import java.io.IOException;


 
public class Hooks {
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
 
 
 @After(order = 1)
 public void afterScenario(Scenario scenario) {
 if (scenario.isFailed()) {
 String screenshotName = scenario.getName().replaceAll(" ", "_");
 try {
	 File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
 
	 File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
 
	 Files.copy(sourcePath, destinationPath); 
	 

 			} catch (IOException e) {
 		} 
 	}
 }
 
 @After(order = 0)
 public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
 }
 
}
