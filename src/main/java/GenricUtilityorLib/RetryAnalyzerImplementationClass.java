package GenricUtilityorLib;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * this is listnersImplementation class
 */

public class RetryAnalyzerImplementationClass implements IRetryAnalyzer
{  
int count=1;
int retryCount=3;

@Override
public boolean retry(ITestResult result)
{
while(count<=retryCount)
{
	count++;
	return true;
}
    return false;
}
}


