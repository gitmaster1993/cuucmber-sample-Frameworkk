package automation.UI.StepDefinition.Cute.LoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import generalFunction.PropertieFileReader_TextFileReader.PropertieFileReader_TextFileReader;

import static GlobalHooks.Hooks.cuteApplicationLoginPage;

public class CuteApplicationLoginPageStepDefinition {
	
//	@Given("^Enter the Search \"([^\"]*)\"$")
//	public void enter_the_Search(String arg1) throws Throwable {
//	  System.out.println("-----------------------");
//	  System.out.println(arg1);
//	  System.out.println("-----------------------");
//	}
	

	@Given("^User enter the \"([^\"]*)\"$")
	public void user_enter_the(String url) throws Throwable {
		System.out.println("i'm from user enter step definition");
		cuteApplicationLoginPage.enterUrl(PropertieFileReader_TextFileReader.readingValueFromCucumberProperties("Application_URL"));
	}
	@Then("^User enters the \"([^\"]*)\" , \"([^\"]*)\" and click on Signin$")
	public void user_enters_the_and_click_on_Signin(String userName, String Password) throws Throwable {
		cuteApplicationLoginPage.enterValues(PropertieFileReader_TextFileReader.readingValueFromCucumberProperties(userName),
				PropertieFileReader_TextFileReader.readingValueFromCucumberProperties(Password));
		System.out.println("I'm from uset enter the username and password step definition");
	}


}