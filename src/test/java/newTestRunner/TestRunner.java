package newTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//FeatureFiles/Login.feature",
		glue = "stepDefination1",
		dryRun = false,
		monochrome = true,
		publish = true
		
		
		
		)



public class TestRunner {

}
