package behaviour;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:src/main/webapp/report/"
        },
        features = {
                "src/test/resources/features"
        },
        glue = {
                "steps"
        },
        monochrome = true,
        tags = {
                "@Feature-Task"
        }
)
public class TaskTrackerApiFeaturesTest {

}