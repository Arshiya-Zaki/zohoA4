package tc_Repository;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenricUtilityorLib.BaseClass;
import GenricUtilityorLib.Excelutility;
import GenricUtilityorLib.JavaUtility;
import ObjectRepsoitory.CreateNewLeadsPage;
import ObjectRepsoitory.Home_Page;
import ObjectRepsoitory.LeadsHomePage;

public class LE_04 extends BaseClass {
	@Test //(groups = {"smoke" , "regression"})
	public void le_04case(WebDriver driver) throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
	    Excelutility EUTIL = new Excelutility();
	    String FIRSTNAME = EUTIL.ReadDataFromExcel("Leads",14,1);
	    String LASTNAME  = EUTIL.ReadDataFromExcel( "Leads",14,2);
	    String COMPANY = EUTIL.ReadDataFromExcel("Leads",14,3);
	    String STREET = EUTIL.ReadDataFromExcel("Leads",14,4);
	    String POBOX = EUTIL.ReadDataFromExcel("Leads",14,5);
	    String POSTALCODE = EUTIL.ReadDataFromExcel("Leads",14,6);
	    String CITY = EUTIL.ReadDataFromExcel("Leads",14,7);
	    String COUNTRY = EUTIL.ReadDataFromExcel("Leads",14,8);
	   
	    Home_Page hp = new Home_Page(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp = new LeadsHomePage(driver);
	    lp.clickOnNewLeadBtn();
	    CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	    cn.CreateLeads(FIRSTNAME+num , LASTNAME , COMPANY , STREET , POBOX , POSTALCODE , CITY, COUNTRY);
	    Thread.sleep(4000);
	    System.out.println("Tc_04 executed successfully!");
	}
}
