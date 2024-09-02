package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenricUtilityorLib.BaseClass;
import GenricUtilityorLib.Excelutility;
import GenricUtilityorLib.JavaUtility;

import ObjectRepsoitory.CreateNewLeadsPage;
import ObjectRepsoitory.Home_Page;
import ObjectRepsoitory.LeadsHomePage;

@Listeners(GenricUtilityorLib.ListnersImplementatyionClass.class)
public class LE_01 extends BaseClass {

	@Test(retryAnalyzer = GenricUtilityorLib.RetryAnalyzerImplementationClass.class)
	public void le_01case()throws Exception
	  {
		JavaUtility JUTIL = new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
	    Excelutility EUTIL = new Excelutility();
	    String FIRSTNAME = EUTIL.ReadDataFromExcel("Leads",2,1);
	    String LASTNAME = EUTIL.ReadDataFromExcel("Leads",2,2);
	    String COMPANY = EUTIL.ReadDataFromExcel("Leads",2,3);
	    Home_Page hp = new Home_Page(driver);
	    hp.clickOnLeads();
	    LeadsHomePage lp = new LeadsHomePage(driver);
	    lp.clickOnNewLeadBtn();
	    CreateNewLeadsPage cn = new CreateNewLeadsPage(driver);
	    cn.CreateLeads(FIRSTNAME+num, LASTNAME, COMPANY);
	    System.out.println("Tc_01 executed sucessfully!!");
	    Thread.sleep(4000);
	    	
	    }
	}

