package cucumber.Options;

import org.apache.log4j.Logger;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import resources.LoggerHelper;

@CucumberOptions
			(
				features = "src/test/java/features",
				glue = { "stepdefinitions" }, 
				plugin = { "pretty","html:reports/cucumber-pretty-report","json:reports/cucumber-json-report/cucumber_test.json" },
				//tags = {"@updatePlaceAfterDeletingPlace"},
				monochrome = true, 
				dryRun = false, 
				strict = true
			)

public class TestRunner extends AbstractTestNGCucumberTests{

	Logger log = LoggerHelper.getLogger(TestRunner.class);

}
