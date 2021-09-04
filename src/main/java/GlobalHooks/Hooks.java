package GlobalHooks;


import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import automation.UI.PageObject.Cute.LoginPage.CuteApplicationLoginPage;
import generalFunction.DriverConfiguration.DriverConfiguration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;


public class Hooks {
	
    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;
    public static Scenario scenario;
    public static CuteApplicationLoginPage loginPage;
    public static CuteApplicationLoginPage cuteApplicationLoginPage;

    @Before
    public void beforeEachScenarioExecution(Scenario scenario) throws IOException {
        this.scenario = scenario;
        driver = DriverConfiguration.function_BrowserDriverSelection();
        driver.manage().window().maximize();
        cuteApplicationLoginPage=new CuteApplicationLoginPage(driver);

    }


    @After
    public void killBrowser(Scenario scenario) {
    	if (scenario.isFailed() == true) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File sourcePath = ts.getScreenshotAs(OutputType.FILE);
				File destinationPath = new File(
				System.getProperty("user.dir") + "/CusisAutomation_Reports/screenshots/" + screenshotName + ".png");
				Files.copy(sourcePath, destinationPath);
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			}
		}
		driver.close();
	}
}
