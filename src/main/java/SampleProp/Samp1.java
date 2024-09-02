package SampleProp;

import java.io.FileInputStream;
import java.util.Properties;

public class Samp1 {
public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\selenium\\A4testdata.xlsx");
Properties pobj = new Properties();
pobj.load(fis);

String URL = pobj.getProperty("url");
String UNAME = pobj.getProperty("username");
String PASS = pobj.getProperty("password");
System.out.println(URL);
System.out.println(UNAME);
System.out.println(PASS);
}
}
