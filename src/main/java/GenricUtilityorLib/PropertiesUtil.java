package GenricUtilityorLib;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {
public String getDataFromProperties(String Data) throws Exception
{
FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\selenium\\commondata.properties");
Properties pobj = new Properties();
 pobj.load(fis);
 String value = pobj.getProperty(Data);
 return value;
}
}