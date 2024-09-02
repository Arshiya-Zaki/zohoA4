package ObjectRepsoitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenricUtilityorLib.SeleniumUtility;


public class Home_Page {

@FindBy(xpath="(//a[text()='Leads'])[1]")	
private WebElement leads;

@FindBy(xpath="(//a[text()='Organizations'])[1]")

private WebElement org;

@FindBy(xpath="(//td[@class='small'])[2]")
private WebElement prefernces;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement singoutOptions;

public Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getLeads() {
	return leads;
}

public WebElement getOrg() {
	return org;
}

public WebElement getPrefernces() {
	return prefernces;
}

public WebElement getSingoutOptions() {
	return singoutOptions;
}
public void clickOnLeads() {
	leads.click();
}
public void org()
{
	org.click();
}
public void logOutOperation(WebDriver driver) throws Exception {
	SeleniumUtility SUTIL = new SeleniumUtility();
	SUTIL.moveCursoronToAnElement(driver, prefernces);
	Thread.sleep(3000);
	SUTIL.moveCursoronToAnElement(driver, singoutOptions);
	SUTIL.clickOnanElement(driver, singoutOptions);
}


}































