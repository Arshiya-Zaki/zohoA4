package tc_Repository;

import org.testng.annotations.Test;

import GenricUtilityorLib.BaseClass;
import GenricUtilityorLib.Excelutility;
import GenricUtilityorLib.JavaUtility;
import ObjectRepsoitory.CreateNewLeadsPage;
import ObjectRepsoitory.Home_Page;
import ObjectRepsoitory.LeadsHomePage;

public class LE_02 extends BaseClass{

@Test//(groups = {"smoke"})
	public void le_02case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
	    Excelutility EUTIL = new Excelutility();
	    String FIRSTNAME = EUTIL.ReadDataFromExcel("Leads", 5 ,1);
	    String LASTNAME = EUTIL.ReadDataFromExcel("Leads", 5, 2);
	    String COMPANY = EUTIL.ReadDataFromExcel("Leads", 5, 3);
	    String TITLE= EUTIL.ReadDataFromExcel("Leads", 5 ,4);
	    String PHONE = EUTIL.ReadDataFromExcel("Leads", 5 ,5);
	    String MOBILE = EUTIL.ReadDataFromExcel("Leads", 5 ,6);
	    String EMAIL = EUTIL.ReadDataFromExcel("Leads", 5 ,7);
	    String NOOFEMPLOYESS = EUTIL.ReadDataFromExcel("Leads", 5, 8);
	    String STREET = EUTIL.ReadDataFromExcel("Leads", 5, 9);
	    String POBOX = EUTIL.ReadDataFromExcel("Leads", 5 ,10);
	    String POSTALCODE = EUTIL.ReadDataFromExcel("Leads", 5, 11);
	    String CITY= EUTIL.ReadDataFromExcel("Leads", 5 ,12);
	    String COUNTRY = EUTIL.ReadDataFromExcel("Leads", 5, 13);
	    String STATE = EUTIL.ReadDataFromExcel("Leads", 5, 14);
	    
	    
	    Home_Page hp = new Home_Page(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp = new LeadsHomePage(driver);
	    lp.clickOnNewLeadBtn();
	    CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	    cn.CreateLeads(FIRSTNAME+num , LASTNAME , COMPANY, TITLE , PHONE , MOBILE , EMAIL , NOOFEMPLOYESS , STREET , POBOX , POSTALCODE , CITY, COUNTRY, STATE);
	    System.out.println("tC_02 xecuted successfully!");
	    Thread.sleep(4000);
	   
	}
}

