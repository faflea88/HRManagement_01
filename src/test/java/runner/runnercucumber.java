package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
features = "src/test/java/resource", 
glue = "definitions")


public class runnercucumber  extends AbstractTestNGCucumberTests{

}
