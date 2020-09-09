package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"lattu.stepDefinitions"},
        plugin = {"pretty",
                "html:target/cucumberReports/cucumber-pretty.html", "json:target/cucumberReports/cucumber.json"},
        monochrome = true,
        tags = "@restTest"
)
public class TestRunner {

}
