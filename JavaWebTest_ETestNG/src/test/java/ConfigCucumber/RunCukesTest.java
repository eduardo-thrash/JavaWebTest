package ConfigCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/Clients.feature",glue="Steps",strict = true)
public class RunCukesTest extends AbstractTestNGCucumberTests{

}
