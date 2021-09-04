package automationRunner;

import com.codoid.products.exception.FilloException;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
				glue = {""},
				tags = {},
				plugin = {"pretty", "html:test-output","com.cucumber.listener.ExtentCucumberFormatter:" },
				dryRun = false, 
				monochrome = false)


public class Runner {
	@AfterClass
	public static void reportSetup() throws IOException, FilloException {

//   /* Maven Goal RunTime Values Change*/
//		System.out.println(System.getProperty("Grid"));
//		System.out.println(System.getProperty("Browser"));
//		System.out.println(System.getProperty("gridHostAddress"));
//		System.out.println(System.getProperty("Application_URL"));

		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("3.3.9", "Maven");
		Reporter.setSystemInfo("1.8.0_66", "Java Version");
		Reporter.setTestRunnerOutput("Cusis Automation Batch");
		Reporter.addStepLog("Step Log Message");
		Reporter.addStepLog("Step Log message goes here");
		Reporter.addScenarioLog("Scenario Log message goes here");

	}
}