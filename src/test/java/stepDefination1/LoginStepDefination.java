package stepDefination1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import chromeWebPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination extends Base1 {
	
	@Given("User open Chrome Browser")
	public void user_open_chrome_browser() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		login=new LoginPage(driver);
		
	}

	@When("User Enter Valid URL {string}")
	public void user_enter_valid_url(String url) throws Exception {
	  
		driver.navigate().to(url);
	Thread.sleep(2000);
	}

	@Then("User Enter Valid User Name {string}")
	public void user_enter_valid_user_name(String email) throws Exception {
	  
	login.setEmail(email);
	Thread.sleep(2000);
	}

	@Then("User Enter Valid Password {string}")
	public void user_enter_valid_password(String pass) throws Exception {
	  
		login.setpass(pass);
		Thread.sleep(2000);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() throws Exception {
	  
	login.clickButton();
	Thread.sleep(2000);
	}

	@When("Validate Page Title {string}")
	public void validate_page_title(String pageName) throws Exception {
	  
	Assert.assertEquals(pageName,driver.getTitle());
	Thread.sleep(2000);
	}

	@Then("User Close Chrome Browser")
	public void user_close_chrome_browser() {
	  
	driver.close();
	}


}
