import java.util.Scanner;    // Scanner Library, to enter data from keyboard
	
public class NanoTimingStuff  
{	
   public static void main(String[] args)  
   {
      // Operands of each type
      double i1 = 2015.0;
      double i2 = 1767.0;
      double i3;
      int i4 = 5;
          
      long t1, t2, totalTime = 0;
      long count;
      double avgTime;
   
      System.out.println("System.nanoTime():");      
      for(count = 1; count <= 2000000000; count*=2)
      {    
         t1 = System.nanoTime();
         for (long j = 1; j <= count; j++)
            //i3 = (int)Math.pow(i1,i2);
            i3 = Math.sin(i1);
            //System.out.print(i4);
         t2 = System.nanoTime();
         totalTime = t2-t1;
         avgTime = (double) totalTime / count;
          
      // Print Results...
         System.out.printf("%10d ops,  %12d Total ms. ==> avg time: %15.12f ns. / op %n", 
                        count, totalTime, avgTime);
      
      }
   }
}
