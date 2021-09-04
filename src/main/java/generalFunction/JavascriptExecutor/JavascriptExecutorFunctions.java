package generalFunction.JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static GlobalHooks.Hooks.driver;


public class JavascriptExecutorFunctions{


    public JavascriptExecutorFunctions() {
        // TODO Auto-generated constructor stub
        PageFactory.initElements(driver, this);
    }
    //Javascript Executor to refresh Browser
    public static void function_JavascriptExecutorRefreshBrowser() {

        ((JavascriptExecutor)driver).executeScript("history.go(0)");
    }

    //Javascript Executor to send data to text field
    public static void function_JavascriptExecutorSendkeys(WebElement ele,String value) {

        ((JavascriptExecutor)driver).executeScript("ele.value='"+value+"';");
    }

    //Javascript Executor to send data to click
    public static void function_JavascriptExecutorClick(WebElement ele) {

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",ele);
    }

    //Javascript Executor scroll the page Horizontally till the element is found
    public static void function_JavascriptExecutorScrollUntilElementVisible(WebElement ele) {

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);
    }

    //Javascript Executor check or uncheck using true or false command
    public static void function_JavascriptExecutorRefreshBrowserWindow(String command) {

        ((JavascriptExecutor)driver).executeScript("ele.checked='"+command+"';");
    }
    public static void function_ListOfElementJavascriptExecutorClick(List<WebElement> ele, int index) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele.get(index));
    }
}
