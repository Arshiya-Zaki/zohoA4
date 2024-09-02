package tc_Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenricUtilityorLib.BaseClass;
import GenricUtilityorLib.Excelutility;
import GenricUtilityorLib.JavaUtility;
import ObjectRepsoitory.CreateNewLeadsPage;
import ObjectRepsoitory.Home_Page;
import ObjectRepsoitory.LeadsHomePage;

public class LE_03 extends BaseClass
{
@Test //(groups = {"sanity"})
	public void le_03tc(WebDriver driver) throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
	    Excelutility EUTIL = new Excelutility();
	    String FIRSTNAME = EUTIL.ReadDataFromExcel("Leads",9,1);
	    String LASTNAME = EUTIL.ReadDataFromExcel("Leads",9,2);
	    String COMPANY = EUTIL.ReadDataFromExcel("Leads",9,3);
	    String TITLE= EUTIL.ReadDataFromExcel("Leads",9,4);
	    String PHONE = EUTIL.ReadDataFromExcel("Leads",9,5);
	    String MOBILE = EUTIL.ReadDataFromExcel("Leads",9,6);
	    String EMAIL = EUTIL.ReadDataFromExcel("Leads",9,7);
	    String NOOFEMPLOYESS = EUTIL.ReadDataFromExcel("Leads",9,8);
	    
	    Home_Page hp = new Home_Page(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp = new LeadsHomePage(driver);
	    lp.clickOnNewLeadBtn();
	    CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	    cn.CreateLeads(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOOFEMPLOYESS);
	    System.out.println("Tc_03 exceuted succesfully!");
	    Thread.sleep(4000);
	    
	}
}
