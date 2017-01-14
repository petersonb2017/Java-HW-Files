import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfWeek {

    public static void main(String[] args) {
        Calendar ca1 = new GregorianCalendar();

        /*
        set(int year, int month, int date)
        Jan=0,Feb=1,Mar=2...
        */
        ca1.set(2015,04,28);

        /*
        Sunday Day of Week 1
        Monday Day of Week 2
        Tuesday Day of Week 3
        Wednesday Day of Week 4
        Thrusday Day of Week 5
        Friday Day of Week 6
        Saturday Day of Week 7
        */

        int DAY_OF_WEEK=ca1.get(Calendar.DAY_OF_WEEK);

        System.out.println("DAY OF WEEK :"+DAY_OF_WEEK);
    }
}