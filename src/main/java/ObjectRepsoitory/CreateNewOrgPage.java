package ObjectRepsoitory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CreateNewOrgPage {
		@FindBy(xpath= "//input[@name='accountname']")
		private  WebElement orgName;
		
		@FindBy(xpath= "//input[@name='website']")
		private  WebElement WebSite;
		
		@FindBy(xpath= "//input[@name='employees']")
		private  WebElement employees;
		
		@FindBy(xpath= "//input[@name='phone']")
		private  WebElement phone;
		
		@FindBy(xpath= "//input[@name='otherphone']")
		private  WebElement otherphone;

		@FindBy(xpath= "//input[@name='email1']")
		private  WebElement email;
		
		@FindBy(xpath= "//textarea[@name='bill_street']")
		private WebElement  billing_Address;
		
		@FindBy(xpath= "//input[@name='bill_city']")
		private  WebElement  billing_city;

		@FindBy(xpath= "//input[@name='bill_state']")
		private  WebElement billing_state;
		
		@FindBy(xpath= "//input[@name='accountname']") 
		private  WebElement saveBtn;
		
		public CreateNewOrgPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this); 
		}
		
		public WebElement getOrgName() {
			return orgName;
		}

		public WebElement getWebSite() {
			return WebSite;
		}

		public WebElement getEmployees() {
			return employees;
		}

		public WebElement getPhone() {
			return phone;
		}

		public WebElement getOtherphone() {
			return otherphone;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getBilling_Address() {
			return billing_Address;
		}

		public WebElement getBilling_city() {
			return billing_city;
		}
		
		public WebElement getBilling_state() {
			return billing_state;
		}
		public WebElement getSaveBtn() {
			return saveBtn;
		}

		/**
		 * this is Business library to create an organization for TC-1
		 */
		public void CreateOrganisation(String OrganisationName,String Website, String emp) {
			orgName.sendKeys(OrganisationName);
			WebSite.sendKeys(Website);
			employees.sendKeys(emp);
			saveBtn.click();
		}
		/**
		 * this is Business library to create an organization for TC-2
		 */
		public void CreateOrganisation(String OrganisationName,String Website, String emp, String phon, String otherPhne, String mailId ) {
			orgName.sendKeys(OrganisationName);
			WebSite.sendKeys(Website);
			employees.sendKeys(emp);
			phone.sendKeys(phon);
			otherphone.sendKeys(otherPhne);
			email.sendKeys(mailId);
			saveBtn.click();
		}
		
		/**
		 * this is Business library to create an organization for TC-3
		 */
		public void CreateOrganisation(String OrganisationName,String Website, String billingAdd ,String billcity, String billState ) {
			orgName.sendKeys(OrganisationName);
			WebSite.sendKeys(Website);
			billing_Address.sendKeys(billingAdd);
			billing_city.sendKeys(billcity);
			billing_state.sendKeys(billState);
			saveBtn.click();
		}
		
			/**
			 * this is Business library to create an organization for TC-4
			 */
			public void CreateOrganisation(String OrganisationName, String Website, String emp, String phon, String otherPhne, String mailId, String billingAdd ,String billcity, String billState)
			{
				orgName.sendKeys(OrganisationName);
				WebSite.sendKeys(Website);
				employees.sendKeys(emp);
				phone.sendKeys(phon);
				otherphone.sendKeys(otherPhne);
				email.sendKeys(mailId);
				billing_Address.sendKeys(billingAdd);
				billing_city.sendKeys(billcity);
				billing_state.sendKeys(billState);
				saveBtn.click();
			}
		}
		




