package GenricUtilityorLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;

public class ListnersImplementatyionClass implements ITestListener
{
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log("from this"+ methodname +"execution starts"); 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
    String methodname = result.getMethod().getMethodName();
    Reporter.log(methodname + "execution successful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
	   
		TakesScreenshot ts =(TakesScreenshot) BaseClass.driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("\\Screenshot\\"+methodname+".png");	
		try {
			Files.copy(scr, dest);
	}
		catch (IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		Reporter.log(methodname + "execution skipps!!");
	}


	@Override
	public void onStart(ITestContext context) {
		}

	@Override
	public void onFinish(ITestContext context) {

		
	}
}