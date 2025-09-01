package Cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/Features", glue = "Cucumber.StepDefinitions"
,tags="@ExamplesTag", plugin = "html:src/report.html", dryRun = false)
public class testRunner {
}
