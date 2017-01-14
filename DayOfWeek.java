import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {

    public static void main(String[] args) {
        Calendar ca1 = new GregorianCalendar();
        ca1.set(2015,7,28);

        int DAY_OF_WEEK = ca1.get(Calendar.DAY_OF_WEEK);

        System.out.println("DAY OF WEEK :" + DAY_OF_WEEK) ;
    }
}