package runner2;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features2/createlead1.feature" , glue="steps2" , monochrome = true  
                              /*, dryRun = true , 
                              snippets = SnippetType.CAMELCASE*/)

public class RunTest2 extends AbstractTestNGCucumberTests {

	
}
