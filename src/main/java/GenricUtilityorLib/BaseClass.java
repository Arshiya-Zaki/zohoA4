package GenricUtilityorLib;
/**
 *Base class for common features of an application
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepsoitory.Home_Page;
import ObjectRepsoitory.LoginPage;

public class BaseClass {
public static WebDriver driver = null;
SeleniumUtility SUTIL= null;
 PropertiesUtil PUTIL= new PropertiesUtil();
 
 @BeforeSuite(alwaysRun= true)
 public void createConnection()throws Exception
 {
	 System.out.println("connection established!!");
	 Thread.sleep(3000);
 }
 
 //@parameter("browser")
 @BeforeClass(alwaysRun = true)
public void launchBrowser() throws Exception 
 {
String URL= PUTIL.getDataFromProperties("URL");
SUTIL = new SeleniumUtility();
driver = new ChromeDriver();
SUTIL.implicitWait(driver, 10);
SUTIL.maximizeWindow();
driver.get(URL);
System.out.println("Launching Successfully");
 }
 
 @BeforeMethod(alwaysRun = true)
 public void loginApp() throws Exception
 {
 String USERNAME = PUTIL.getDataFromProperties("username");
 String PASSWORD =PUTIL.getDataFromProperties("password");
 LoginPage lp = new LoginPage(driver);
 lp.LoginOperation(USERNAME, PASSWORD);
 System.out.println("LOGIN SUCCESSFULL!!");
 
 }
 
 @AfterMethod(alwaysRun = true)
 public void LogoutApp() throws Exception
 {
	 Home_Page hp = new Home_Page(driver);
	 hp.logOutOperation(driver);
    System.out.println("logout Successfully");
 }
 
 @AfterClass(alwaysRun = true)
	 public void closeApp()
	 {
		 driver.close();
    System.out.println("Browser closed Successfully!!");
	 }
 
 @AfterSuite(alwaysRun = true)
 public void closeConnection()
 {
	System.out.println("Connection closed Successfully!!"); 
 }
 
 }
