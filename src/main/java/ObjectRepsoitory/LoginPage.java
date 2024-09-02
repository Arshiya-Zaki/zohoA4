package ObjectRepsoitory;
/**
 * this is POm class for login page
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
    private WebElement password;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	/**
	 * this i the business library to do the login operation
	 */
	public void LoginOperation(String uname,String pass)
	{
	  username.sendKeys(uname);
	  password.sendKeys(pass);
	  loginBtn.click();
	  
	}
	
}

