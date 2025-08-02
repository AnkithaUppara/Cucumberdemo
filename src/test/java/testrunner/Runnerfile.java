package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\USER\\eclipse-workspace\\Cucumberdemo\\AllFeaturefiles\\Facebooklogin.feature",
		glue={"stepdefination"}
		)
public class Runnerfile  extends  AbstractTestNGCucumberTests{

}
