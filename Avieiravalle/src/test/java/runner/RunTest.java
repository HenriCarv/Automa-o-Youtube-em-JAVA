package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:src/main/report",
                "json:src/main/report/cucumber.json",
                "junit:src/main/report/cucumber.xml"
        },
        features = {
                "src/test/java/feature/"
        },
        glue = {
                "step", "hooks"
        },
        tags = "@Regressivo"
)


public class RunTest {
}
