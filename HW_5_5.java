import java.lang.Math;
import javax.swing.JOptionPane;
import java.util.Scanner; 

public class HW_5_5
{
   public static void main(String[] args)
   {
   
   double fact = 1;
   double sum = 1;
   
   System.out.println("S sub 0   =  1.000000000000  and E sub 1   =  " + 1.7182818284590);
      
      for(double i=1.0; i<=40.0; i++){
      fact *= i;
      sum += 1.0/(fact);
      System.out.printf("%1s %-2.0f %-1s %.12f %1s %-2.0f %1s %.12f\n", "S sub", i, " = ", sum, " and E sub", i, " = ", Math.abs(sum - Math.E));
         }
   
   
            
   }
}   
   
