package Sample_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
@Test
public void hardAssertStrictComparision()
{
	String expectedData ="raja";
	String actualData ="Raja";
	Assert.assertEquals(actualData,expectedData );
	System.out.println("strict level comparison passed");
}
@Test
public void containsLevelComparision()
{
	String expectedData ="raja";
	String actualData ="maharaja";
	Assert.assertTrue(actualData.contains(expectedData) );
	System.out.println("contains level comparison passed");
}
}
