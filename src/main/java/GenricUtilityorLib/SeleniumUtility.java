package GenricUtilityorLib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {

	WebDriver driver = null;
	Actions act =null;
	Select s = null;
	
	/*this is a generic method for implicit wait
	 * @param particularSeconds
	 */

    public void implicitWait(WebDriver driver, int particularSeconds)
    {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
    }
    
    /*
     * generic method to maximize 
     */
    public void maximizeWindow()
    {
	driver.manage().window().maximize();
    }
    
    /*---------------Action class methods----------------------------------------------
    * generic method to right click on an Element
    * @param element
    */ 
    public void rightClickOnElement(WebDriver driver, WebElement element)
    {
	 act= new Actions(driver);
	 act.contextClick(element).perform();
    }
    
   /*this is generic method to click on an element
    * @param element
    */
    
    public void clickOnanElement(WebDriver driver,WebElement element)
    {
	act= new Actions(driver);
	act.click(element).perform();
    }
	 
	 /*
	  * this is generic method to Drag and drop an element
      */
    
	 public void dragAndDropAnElement(WebDriver driver, WebElement src, WebElement target)
	 {
		 act= new Actions(driver);
		 act.dragAndDrop(src,target).perform();
     }	 
		 /*
		 * this is generic method to Drag and drop pointer
    	 */
	 
	 public void dragAPointer(WebDriver driver, WebElement src, int xoffset,int yoffset) 
		 {
			 act= new Actions(driver);
			 act.dragAndDropBy(src,xoffset,yoffset).perform();
		 }
	 
	 /* this is generic method to perform scroll down operation
	  * 
	  */
	 
	 public void ScrollToaParticularElement(WebDriver driver, WebElement element) 
		 { 
		 act= new Actions(driver);
		 act.scrollToElement(element).perform();
		 }
	 
		 /* this is generic method to move mouse cursor to a particular element
		  * 
		  */
	 
	 public void moveCursoronToAnElement(WebDriver driver, WebElement element) 
		 { 
		 act= new Actions(driver);
		 act.moveToElement(element).perform();
		 }
		 
	     /*
	      *this is a generic method to hold an element 		 
	      */
	 
      public void holdAnElement(WebDriver driver, WebElement element) 
	     { 
	 	 act= new Actions(driver);
		 act.clickAndHold(element).perform();
      	 }
      
	     /*
	      * this is a generic method to release an element	 
	      */
      
	    public void releaseAnElement(WebDriver driver, WebElement element) 
	    { 
		 act= new Actions(driver);
		 act.release(element).perform();
	    }
	    
	/*----------------Select class generic functions---------------------------
	 * this is a generic method to select an option based on index
	 */
	    
	public void selectElementByIndex(WebElement element ,int indexNum)
	{
		s=new Select(element);
		s.selectByIndex(indexNum);
	}
	
	/*this is a generic method to select an option based on visible text
	 * 
	 */
	
	public void selectElementByVisibleText(WebElement element ,String text)
	{
		s=new Select(element);
		s.selectByVisibleText(text);
		
	}
	
	/*this is a generic method to select an option based on value
	 * 
	 */
	
	public void selectElementByValue(WebElement element ,String Value)
		{
			s=new Select(element);
			s.selectByValue(Value);
		}
	
	 /*this is a generic method to select an option based on Index value
	  * 
	  */
	
	 public void selectElemenAll(WebElement element ,int Value)
		{
			s=new Select(element);
			s.deselectAll();
		}
	 
	/*this is a generic method to de-select an option based on value index value
	 * 
	 */
	 
	 public void deSelectElementByIndex(WebElement element,int indexNum)
	 {
		 s= new Select(element);
		 s.deselectByIndex(indexNum);
	 }
	 
	 /*this is a generic method to de-select an option based on value
	  * 
	  */
	 
	 public void deselectElementByValue(WebElement element , String Value)
		{
			s=new Select(element);
	        s.deselectByValue(Value);
		}
	 
	 /*this is a generic method to de-select an option based on visibleText
	  * 
	  */
	 
	 public void deselectElementByVisibleText(WebElement element,String text)
		{
			s=new Select(element);
			s.deselectByVisibleText(text);	
	     }
	 
		/*
		 * this is a generic method to de-select all the options
		 */
	 
	 public void deselectElemenAllOptions(WebElement element)
		{
			s=new Select(element);
			s.deselectAll();
		}
			 
	 /*
	  * this method will help us to fetch all the selected option from a multi- select drop down
	  */
	 
    public List<WebElement>	fetchAllSelectedOptions(WebElement element)
    {
    	 s= new Select(element);
    	 List<WebElement> all =s.getAllSelectedOptions();
    	 return all;
    }
    
    /*
     *  this is a generic method to read all option from a multi-select drop down
     */
    
    public List<WebElement>	fetchAllOptions(WebElement element)
    {
    	 s= new Select(element);
    	 List<WebElement> all =s.getAllSelectedOptions();
    	 return all;
    }
    
    /*Generic Method to accept alert
     * 
     */
    
    public void acceptAlert()
    {
    driver.switchTo().alert().accept();	
    }
    
    /*
     * Generic Method to dismiss alert
     */
    public void dismissAlert()
    {
    driver.switchTo().alert().dismiss();
    }
    
    /* this is a generic method to switch frame based on child index
     * 
     */
    public void switchTochildFrame(int childFrameindex)
    {
    	driver.switchTo().frame(childFrameindex);
    }	 
					 
}

