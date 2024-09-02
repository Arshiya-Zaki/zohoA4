package ObjectRepsoitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is a POM class for orgHomePage
 */
public class OrgHomePage {
	@FindBy(xpath="")
	private WebElement  newOrgBtn;
	
	
	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this); 
	}


	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}
	/**
	 *  Business lib to click on new org btn
	 */
		public void ClickOnOrgBtn()
		{
			newOrgBtn.click();
    	}

}
