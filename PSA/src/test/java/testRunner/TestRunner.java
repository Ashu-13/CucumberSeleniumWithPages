package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", //the path of the feature files
		glue={"com.stepDefs.practice"}, //the path of the step definition files
		plugin= {"pretty"} //to generate different types of reporting
	
		)
public class TestRunner {
	

}
