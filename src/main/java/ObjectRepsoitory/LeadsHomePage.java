package ObjectRepsoitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomePage {
   /**
    * this is a POM class for leads page
    */
	@FindBy(xpath="//img[@title='Create Leead...']")
	private WebElement createNewLeadButton; 
	
	public LeadsHomePage(WebDriver  driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getCreatenewLeadsButton()
	{
		return createNewLeadButton;
	}
	
	/**
	 * this is business library to click on new btn
	 */
	
	public  void clickOnNewLeadBtn()
	{
		createNewLeadButton.click();
	}
	
}
