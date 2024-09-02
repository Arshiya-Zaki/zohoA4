package Sample_test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
@Test
	public void createUser()
	{
	System.out.println("User_ Created!!!");
	}
@Test (enabled =false)
public void modifyUser()
{
	System.out.println("user_Modified!!");
}
@Test 
@Ignore
public void deleteUser()
{
	System.out.println("user_Deleted!");
}
}
