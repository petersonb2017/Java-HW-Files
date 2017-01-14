import java.util.GregorianCalendar;

public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(1994, 8, 28); 
      Day later = today.addDays(10000);
      
      
      System.out.println("Days from today =");
      System.out.println(later.daysFrom(today));
      System.out.println("Year =");
      System.out.println(later.getYear());
      System.out.println("Month =");
      System.out.println(later.getMonth());
      System.out.println("Day of Month =");
      System.out.println(later.getDate());
      //System.out.println(later.getWeekday()):
      
      System.out.println();
      System.out.println();
      
      
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
             
      
   }
}
