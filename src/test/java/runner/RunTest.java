package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/createlead.feature" , glue="steps" , monochrome = true)

public class RunTest extends AbstractTestNGCucumberTests {

}
