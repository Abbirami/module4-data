package cookingPage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" },features = {"C:\\Users\\abbire\\Desktop\\185916_SET8\\185916_SET8\\src\\test\\resources\\cooking"},dryRun=false)
public class TestRunner {

}