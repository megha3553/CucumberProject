package chromeWebPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='Email']")WebElement txtEmail;
	@FindBy(xpath = "//input[@id='Password']")WebElement txtPass;
	@FindBy(xpath = "//button[@class='button-1 login-button']")WebElement btnLogin;
	
	public void setEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	public void setpass(String pass)
	{
		txtPass.clear();
		txtPass.sendKeys(pass);
	}
	public void clickButton()
	{
		btnLogin.click();
	}

}
