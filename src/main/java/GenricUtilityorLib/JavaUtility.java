package GenricUtilityorLib;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaUtility {
public String CalenderHandeling(String pattern) {
	Calendar cal=Calendar.getInstance();
	Date d= cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    String date = sdf.format(d);
    return date;

}

public int getRandomNumber(int range) {
	Random r = new Random();
	int num =r.nextInt(range);
	return num;
}

}
