// Harini Suresh
/*
 * Activity 2.5.9
 * 
 * A LastModified class for the MediaLibrary program
 */
import java.util.Calendar;
public class LastModified {
  public static String getDateTime() {
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    return dateTimeStr;
  }
}
