package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"lattu.stepDefinitions"},
        plugin = {"pretty",
                "html:target/cucumberReports/cucumber-pretty.html", "json:target/cucumberReports/cucumber.json"},
        monochrome = true,
        tags = "@helloName"
)
public class TestRunner {

}
