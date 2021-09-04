package automation.UI.PageObject.Cute.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static GlobalHooks.Hooks.driver;

public class CuteApplicationLoginPage {
	public WebDriver driver;

	public CuteApplicationLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
      
	public void enterUrl(String url) throws InterruptedException {
		driver.navigate().to(url);
		Thread.sleep(8000);
	}

	@FindBy(xpath="//input[@name='email']")
	public static WebElement txt_userName;

	@FindBy(xpath="//input[@name='pass']")
	public static WebElement txt_Password;

	@FindBy(xpath="//button[@name='login']")
	public static WebElement btn_Login;


	public void enterValues(String userName,String Password) throws InterruptedException {
		txt_userName.sendKeys(userName);
		txt_Password.sendKeys(Password);
		btn_Login.click();
		Thread.sleep(10000);
	}
    }