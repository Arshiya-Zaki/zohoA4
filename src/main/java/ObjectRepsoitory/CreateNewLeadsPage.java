
package ObjectRepsoitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage {
 @FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
 
	 @FindBy(xpath ="//input[@name='lastname']")
	private WebElement lastname;
	 
	 @FindBy(xpath ="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
		
    @FindBy(xpath ="//input[@name='phone']")
    private WebElement phone;
			
	@FindBy(xpath ="//input[@name='mobile']")
	private WebElement Mobile;		
	
	@FindBy(xpath ="//input[@name='email']")
	private WebElement Email;	
	
	@FindBy(xpath ="//input[@name='noofemployees']")
	private WebElement NoOfEmployees;	
	
	@FindBy(xpath ="//textarea[@name='lane']")
	private WebElement Street;	
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement Pobox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement Postalcode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath ="//input[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="(//input[title='Save[Alt+S]'])[2]")
	private WebElement saveBtn;
	

	public CreateNewLeadsPage(WebDriver  driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}

	public WebElement getStreet() {
		return Street;
	}

	public WebElement getPobox() {
		return Pobox;
	}

	public WebElement getPostalcode() {
		return Postalcode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	/** Business logic for TC_01
	 * 
	 */
	
	public void CreateLeads(String FrstName , String lName , String comp ) 
	{
		firstName.sendKeys("FrstName");
		lastname.sendKeys("lName");
		company.sendKeys("comp");
		saveBtn.click();
	}
	/**BL for TC_02
	 * @param frstName
	 * @param lName
	 * @param comp
	 * @param desg
	 * @param phne
	 * @param mob
	 * @param mailId
	 * @param noOfEmp
	 * @param street
	 * @param pobox
	 * @param pcode
	 * @param city
	 * @param cntry
	 * @param state
	 */
	public void  CreateLeads(String frstName, String lName, String  comp, String  desg, String  phne,
			String  mob, String  mailId, String  noOfEmp, String  stret, String  pobox,
			String  pcode, String cty, String  cntry, String  state)
	{	
		firstName.sendKeys(frstName);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phne);
		Mobile.sendKeys(mob);
		Email.sendKeys(mailId);
		NoOfEmployees.sendKeys(noOfEmp);
		Street.sendKeys(stret);
		Pobox.sendKeys(pobox);
		Postalcode.sendKeys(pcode);
		City.sendKeys(cty);
		Country.sendKeys(cntry);
		State.sendKeys(state);
		saveBtn.click();
	}
	
	/**
	 * this is Business logic for TC_03
	 */
	public void  CreateLeads(String frstName, String lName, String  comp ,String  desg, String phne, String mob, String mailId, String nOfemp) 
	 {
		 firstName.sendKeys(frstName);
			lastname.sendKeys(lName);
			company.sendKeys(comp);
			title.sendKeys(desg);
			phone.sendKeys(phne);
			Mobile.sendKeys(mob);
			Email.sendKeys(mailId);
			NoOfEmployees.sendKeys(nOfemp);
			saveBtn.click();
	 
	 }
	/**
	 * this is Business logic  to create an Lead for TC_04
	 */
	public void  CreateLeads(String frstName, String lName, String  comp ,String  stret, String pbox ,String pode,  String cty,String cntry,String ste)
	{

		firstName.sendKeys(frstName);
		lastname.sendKeys(lName);
		company.sendKeys(comp);
		Street.sendKeys(stret);
		Pobox.sendKeys(pbox);
		Postalcode.sendKeys(pode);
		City.sendKeys(cty);
		Country.sendKeys(cntry);
		State.sendKeys(ste);
		saveBtn.click();

	}
	
	
}







