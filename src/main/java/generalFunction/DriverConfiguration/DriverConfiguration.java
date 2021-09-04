package generalFunction.DriverConfiguration;


import generalFunction.PropertieFileReader_TextFileReader.PropertieFileReader_TextFileReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;

public class DriverConfiguration {


    public static RemoteWebDriver function_BrowserDriverSelection() throws IOException {
    	
       boolean gridExecution= Boolean.parseBoolean(PropertieFileReader_TextFileReader.readingValueFromCucumberProperties("Grid"));
       String BrowserName=PropertieFileReader_TextFileReader.readingValueFromCucumberProperties("Browser");
       String gridHostAddress=PropertieFileReader_TextFileReader.readingValueFromCucumberProperties("gridHostAddress");

try {
    if (BrowserName.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\chromedriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("--headless");
        if (gridExecution) {
            return new RemoteWebDriver(new URL(gridHostAddress), cap);
        } else {
            return new ChromeDriver(options);
        }
    } else if (BrowserName.equalsIgnoreCase("edge")) {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\msedgedriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        if (gridExecution) {
            return new RemoteWebDriver(new URL(gridHostAddress), cap);
        } else {
            return new EdgeDriver();
        }
    } else if (BrowserName.equalsIgnoreCase("IE")) {
        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\IEDriverServer.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        if (gridExecution) {
            return new RemoteWebDriver(new URL(gridHostAddress), cap);
        } else {
            return new InternetExplorerDriver();
        }
    } else if (BrowserName.equalsIgnoreCase("firefox")) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\Drivers\\geckodriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        if (gridExecution) {
            return new RemoteWebDriver(new URL(gridHostAddress), cap);
        } else {
            return new FirefoxDriver();
        }
    }
}catch (Exception e)
{
    System.out.println(e.getStackTrace());
}

        return null;
    }
}
